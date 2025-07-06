package Graph_14.BFS_DFS_AND_PROBLEMS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    }
}
