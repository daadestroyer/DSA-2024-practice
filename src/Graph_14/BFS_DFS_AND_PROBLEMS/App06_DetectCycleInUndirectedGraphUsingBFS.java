package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App06_DetectCycleInUndirectedGraphUsingBFS {
    public static boolean bfsCheckCycle(int start, List<List<Integer>> adjList, boolean[] vis) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{start, -1});
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

    public static boolean detectCycle(int V, int[][] edges) {
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
        boolean res = detectCycle(V, edges);
        System.out.println(res);
    }
}
