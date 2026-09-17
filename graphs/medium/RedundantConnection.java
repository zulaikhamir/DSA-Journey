// LeetCode 684 - Redundant Connection
// https://leetcode.com/problems/redundant-connection/
// A tree with n nodes had one extra edge added, creating exactly one cycle.
// Find the edge that can be removed to restore a tree (return the last such edge in input order).
// Approach: Union-Find — the edge that connects two nodes already in the same set is the answer.
// Time: O(E * alpha(n)) ~ O(E), Space: O(n)

public class RedundantConnection {

    static int[] parent;

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {1, 3}, {2, 3}};

        int[] result = findRedundantConnection(edges);
        System.out.println("Redundant edge: [" + result[0] + ", " + result[1] + "]");
    }

    static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        for (int i = 0; i <= n; i++) parent[i] = i;

        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            int rootA = find(a), rootB = find(b);

            if (rootA == rootB) {
                return edge; // this edge closes a cycle -> it's the redundant one
            }
            parent[rootA] = rootB;
        }

        return new int[0]; // no redundant edge found (shouldn't happen per problem constraints)
    }

    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
}
