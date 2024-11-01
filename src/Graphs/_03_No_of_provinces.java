package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class _03_No_of_provinces {
    public int findCircleNum(int[][] isConnected) {
        boolean [] visited = new boolean[isConnected.length+1];

        int count=0;

        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]){
                count++;
                bfs(i, isConnected, visited);
            }
        }

        return count;

    }

    public static void bfs(int startingnode, int[][] adj, boolean[] visited) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(startingnode);
        visited[startingnode] = true;

        while(!queue.isEmpty()){
            int node  = queue.poll();

            for(int i=0; i<adj.length; i++){
                if(adj[node][i] == 1){
                    if(!visited[i]){
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }

    }
}
