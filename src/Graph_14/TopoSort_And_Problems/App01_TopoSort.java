package Graph_14.TopoSort_And_Problems;

import java.util.ArrayList;
import java.util.Stack;

public class App01_TopoSort {
    public static void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adjList) {
        vis[node] = 1;
        for (int it : adjList.get(node)) {
            if (vis[it] == 0) {
                dfs(it, vis, st, adjList);
            }
        }
        st.push(node);
    }

    public static ArrayList<Integer> topoSort(int V, int E, int[][] edges) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
        }
        int[] vis = new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                dfs(i, vis, st, adjList);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!st.isEmpty()) {
            res.add(st.pop());
        }
        return res;
    }

    public static void main(String[] args) {
        int V = 4, E = 3;
        int edges[][] = {{3, 0}, {1, 0}, {2, 0}};
        ArrayList<Integer> res = topoSort(V, E, edges);
        System.out.println(res);

        /*
            Time Complexity:
            =================
            Building adjList = O(N)
            DFS Traversal = each node will be visited once O(V) and all its neighbours O(E) = O(V+E)
            Stack Popping = O(V)
            Total = O(V+E)

            Space Complexity:
            =================
            Adj List : O(V+E)
            Vis Array : O(V)
            DFS Call : O(V)
            Result List : O(V)
            Total : O(V+E)
        */
    }
}
