// LeetCode 323 - Number of Connected Components in an Undirected Graph (Premium)
// https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
// Free alternative: https://neetcode.io/problems/count-connected-components
// Given n nodes (0 to n-1) and a list of undirected edges, count connected components.
// Approach: Union-Find (disjoint set) with path compression + union by rank.
// Time: O(E * alpha(n)) ~ O(E), Space: O(n)

public class NumberOfConnectedComponents {

    static int[] parent;
    static int[] rank_;

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}};

        System.out.println("Connected components: " + countComponents(n, edges));
    }

    static int countComponents(int n, int[][] edges) {
        parent = new int[n];
        rank_ = new int[n];

        for (int i = 0; i < n; i++) parent[i] = i;

        int components = n;

        for (int[] edge : edges) {
            if (union(edge[0], edge[1])) {
                components--; // successful union means two components merged into one
            }
        }

        return components;
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    static boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) return false; // already connected, would form a cycle

        if (rank_[rootA] < rank_[rootB]) {
            parent[rootA] = rootB;
        } else if (rank_[rootA] > rank_[rootB]) {
            parent[rootB] = rootA;
        } else {
            parent[rootB] = rootA;
            rank_[rootA]++;
        }
        return true;
    }
}
