package Graph_14.ShortestPathAlgo_And_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App01_ShortedPathInUnidirectedGraph {
    public static int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbour : adj.get(node)) {
                if (dist[node] + 1 < dist[neighbour]) {
                    dist[neighbour] = 1 + dist[node];
                    q.add(neighbour);
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                dist[i] = -1;
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int adj[][] = {{1, 3}, {0, 2}, {1, 6}, {0, 4}, {3, 5}, {4, 6}, {2, 5, 7, 8}, {6, 8}, {7, 6}};
        int src = 0;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < adj.length; i++) {
            ArrayList<Integer> neighbours = new ArrayList<>();
            for (int neighbour : adj[i]) {
                neighbours.add(neighbour);
            }
            adjList.add(neighbours);
        }

        int[] res = shortestPath(adjList, src);
        System.out.println(Arrays.toString(res));
    }
}
