package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

public class App08_DetectCycleInUnidirectedGraphUsing_DFS {
    private static boolean checkCycleDFS(int node, int parent, List<List<Integer>> adjList, boolean[] vis) {
        vis[node] = true;
        for (int neighbour : adjList.get(node)) {
            if (!vis[neighbour]) {
                if (checkCycleDFS(neighbour, node, adjList, vis)) {
                    return true;
                }
            } else if (neighbour != parent) {
                return true;
            }
        }
        return false;
    }

    private static boolean detectCycleUsingDFS(int v, int[][] edges) {
        // Create adjacecny list
        List<List<Integer>> adjList = new ArrayList<>();
        boolean[] vis = new boolean[v];
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (checkCycleDFS(i, -1, adjList, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 8;
        int edges[][] = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {3, 4}};
        boolean res = detectCycleUsingDFS(V, edges);
        System.out.println(res);

        /*
            Time Complexity:
            ===============
            V = number of vertices
            E = number of edges

            1. Adjacency List Construction:
            -----------------------------------
            For E edges, you add entries in the adjacency list:
	        •	Time = O(E)

	        2. DFS Traversal:
            -----------------------------------
            You iterate over all vertices O(V), but each DFS call:
                * Visits each node once.
	            * Explores all neighbors; across the entire graph, all edges are visited twice (once from each end).

	         Total DFS cost:
	            * Node visits: O(V)
	            * Edge visits: O(2E) = O(E)


	         == O(V + E)

            Space Complexity:
            ==================
                Adjacency List Space: O(V + E)
                    * O(V) for the outer list.
	                * O(E) for storing neighbors.

	            Visited Array Space
	                * Uses O(V) space.

	            Call Stack for DFS:
	                In the worst case (graph is a single connected chain):
	                * DFS recursion depth can be O(V).

	         == O(V + E)


             TC : O(V + E)
             SC : O(V + E)
         */
    }


}
