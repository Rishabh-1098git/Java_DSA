package com.Rishabh;
import java.util.*;

public class Customisable_Graph {
    public static void main(String[] args) {

    }

    static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static List<List<Edge>> graph;
    static boolean[] visited;
    static int startNode, endNode;

    public static int findMinimumCost(int treeNodes, List<Integer> treeFrom, List<Integer> treeTo, List<Integer> treeWeight, int start, int end) {
        graph = new ArrayList<>();
        visited = new boolean[treeNodes + 1];
        startNode = start;
        endNode = end;

        // Initialize graph
        for (int i = 0; i <= treeNodes; i++) {
            graph.add(new ArrayList<>());
        }

        // Build the graph
        for (int i = 0; i < treeFrom.size(); i++) {
            int from = treeFrom.get(i);
            int to = treeTo.get(i);
            int weight = treeWeight.get(i);

            graph.get(from).add(new Edge(to, weight));
            graph.get(to).add(new Edge(from, weight));
        }

        // Perform DFS
        long result = dfs(start, 0);

        return (int) result;

    }

    public static long dfs(int node, int parentWeight) {
        visited[node] = true;
        long cost = 0;

        // Traverse all adjacent nodes
        for (Edge edge : graph.get(node)) {
            int nextNode = edge.to;
            int edgeWeight = edge.weight;

            // If the next node is not visited, traverse it
            if (!visited[nextNode]) {
                cost += dfs(nextNode, edgeWeight);
            }

            // Calculate cost for the edge
            int requiredTimes = visited[startNode] && visited[endNode] ? 1 : 2;
            cost += (long) ((long) edgeWeight * Math.ceil(requiredTimes / 2.0));
        }

        return cost;
    }
}
