package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.List;

public class App03_NumberOfProvinces_547 {
    public void dfs(int i,boolean[] vis,List<List<Integer>> adjList){
        vis[i] = true;
        for(int it : adjList.get(i)){
            if(!vis[it]){
                dfs(it,vis,adjList);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        // Create and Initialize adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        int n = isConnected.length;

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(isConnected[i][j]==1 && i != j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }

        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i=0 ; i<n ; i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,adjList);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        /*
            Time Complexity
            ---------------
            m = no of rows
            n = no of cells
            Total Cells = m * n

            Initial loop to count fresh oranges and collect rotten ones takes O(m * n).
            BFS processing is also O(m * n).

            Time Complexity : O(m * n)

            Space Complexity
            ----------------
            Queue (rotten_oranges): n worst case, it can hold all m * n elements → O(m * n)
            No extra visited array, we use the grid in-place →

            Space Complexity : O(m * n)
        */
    }
}
