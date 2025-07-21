package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App07_DetectCycleInUndirectedGraphUsing_BFS {
    public static boolean bfsCheckCycle(int start, List<List<Integer>> adjList, boolean[] vis) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{start, -1});
        vis[start] = true;

        while (!qu.isEmpty()) {
            int[] current = qu.poll();
            int node = current[0];
            int parent = current[1];

            for (int neighbour : adjList.get(node)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    qu.add(new int[]{neighbour, node});
                } else if (neighbour != parent) {
                    return true; // cycle detected
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUsingBFS(int V, int[][] edges) {
        // create adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] arr : edges) {
            adjList.get(arr[0]).add(arr[1]);
            adjList.get(arr[1]).add(arr[0]);
        }

        boolean[] vis = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfsCheckCycle(i, adjList, vis)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 8;
        int edges[][] = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {3, 4}};
        boolean res = detectCycleUsingBFS(V, edges);
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

	        2. BFS Traversal:
            -----------------------------------
            For each unvisited node:
                * Perform BFS from that node.
                * Each node is enqueued and dequeued at most once: O(V)
                * For each node, we iterate over its neighbors:
                    *  All neighbors across the entire graph sum to O(2E) = O(E) since the graph is undirected.

	         == O(V + E)

            Space Complexity:
            ==================
                Adjacency List Space: O(V + E)
                    * O(V) for the outer list.
	                * O(E) for storing neighbors.

	            Visited Array Space
	                * Uses O(V) space.

	            Queue for BFS:
	                In the worst case (fully connected component):
	                    * Queue can hold up to O(V) elements.

	         == O(V + E)


             TC : O(V + E)
             SC : O(V + E)
         */
    }
}
