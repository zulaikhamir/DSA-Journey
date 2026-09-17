// LeetCode 743 - Network Delay Time
// https://leetcode.com/problems/network-delay-time/
// times[i] = [u, v, w]: signal from u to v takes w time. Starting from node k, find time
// for the signal to reach all n nodes, or -1 if impossible.
// Approach: Dijkstra's algorithm using a min-heap.
// Time: O(E log V), Space: O(V + E)

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;

        System.out.println("Network delay time: " + networkDelayTime(times, n, k));
    }

    static int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) adj.add(new ArrayList<>());

        for (int[] t : times) {
            adj.get(t[0]).add(new int[]{t[1], t[2]}); // neighbor, weight
        }

        int[] dist = new int[n + 1];
        java.util.Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        // min-heap ordered by accumulated distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], d = curr[1];

            if (d > dist[node]) continue; // stale entry, already found a shorter path

            for (int[] edge : adj.get(node)) {
                int next = edge[0], weight = edge[1];
                int newDist = d + weight;

                if (newDist < dist[next]) {
                    dist[next] = newDist;
                    pq.offer(new int[]{next, newDist});
                }
            }
        }

        int maxDist = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) return -1; // unreachable node
            maxDist = Math.max(maxDist, dist[i]);
        }
        return maxDist;
    }
}
