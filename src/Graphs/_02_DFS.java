package Graphs;

import java.util.ArrayList;

public class _02_DFS {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean [] visited = new boolean[V];

 
        helper(adj, dfs, visited, 0);

        return dfs;
    }

    public void helper(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, boolean[] visited, Integer node){
        visited[node] = true;
        dfs.add(node);

        for(Integer it : adj.get(node)){
            if(!visited[it]){
                helper(adj, dfs, visited, it);
            }
        }

    }
}
