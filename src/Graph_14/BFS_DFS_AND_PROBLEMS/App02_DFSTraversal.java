package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App02_DFSTraversal {
    private static void dfs(int node, boolean[] vis, ArrayList<Integer> dfs, ArrayList<ArrayList<Integer>> adj) {
        dfs.add(node);
        vis[node] = true;
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(node, vis, dfs, adj); // recursive call for neighbour
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> dfs = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        dfs(0, vis, dfs, adj);
        System.out.println(dfs);
    }
}
