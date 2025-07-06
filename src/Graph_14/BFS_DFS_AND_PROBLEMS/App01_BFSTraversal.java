package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class App01_BFSTraversal {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[adj.size()];
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int it : adj.get(node)) {
                if (!vis[it]) {
                    bfs.add(it);
                    vis[it] = true;
                }
            }
        }
        return bfs;
    }

    public static void main(String[] args) {

    }
}
