// LeetCode 133 - Clone Graph
// https://leetcode.com/problems/clone-graph/
// Deep-copy an undirected graph given a reference node.
// Approach: DFS + HashMap from original node -> cloned node to avoid re-cloning and to handle cycles.
// Time: O(V + E), Space: O(V)

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class GraphNode {
    int val;
    List<GraphNode> neighbors;

    GraphNode(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }
}

public class CloneGraph {

    static Map<GraphNode, GraphNode> visited = new HashMap<>();

    public static void main(String[] args) {
        // Build a small graph: 1 - 2 - 3 - 1 (triangle)
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        n1.neighbors.add(n2);
        n1.neighbors.add(n3);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n1);
        n3.neighbors.add(n2);

        GraphNode clonedStart = cloneGraph(n1);
        System.out.println("Cloned start node value: " + clonedStart.val);
        System.out.println("Cloned node is a different object: " + (clonedStart != n1));
        System.out.println("Cloned neighbor count: " + clonedStart.neighbors.size());
    }

    static GraphNode cloneGraph(GraphNode node) {
        if (node == null) return null;

        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        GraphNode clone = new GraphNode(node.val);
        visited.put(node, clone);

        for (GraphNode neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }
}
