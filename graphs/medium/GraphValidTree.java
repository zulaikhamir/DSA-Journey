// LeetCode 261 - Graph Valid Tree (Premium)
// https://leetcode.com/problems/graph-valid-tree/
// Free alternative: https://neetcode.io/problems/graph-valid-tree
// Given n nodes and a list of undirected edges, determine if they form a valid tree.
// A valid tree needs exactly n-1 edges, and every node must be reachable (fully connected, no cycles).
// Approach: Union-Find — if any edge connects an already-connected pair, there's a cycle.
// Time: O(E * alpha(n)) ~ O(E), Space: O(n)

public class GraphValidTree {

    static int[] parent;

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};

        System.out.println("Is valid tree: " + validTree(n, edges));

        int[][] withCycle = {{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}};
        System.out.println("Is valid tree (with cycle): " + validTree(n, withCycle));
    }

    static boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) return false; // a tree with n nodes needs exactly n-1 edges

        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;

        for (int[] edge : edges) {
            int rootA = find(edge[0]);
            int rootB = find(edge[1]);

            if (rootA == rootB) return false; // cycle detected
            parent[rootA] = rootB;
        }

        return true; // n-1 edges and no cycle -> fully connected tree
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
