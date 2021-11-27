package org.example;

import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;

import java.util.*;

public class MaximumFlow {
  public static int edmundKarp(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex s, Vertex t) {
    Map<DefaultEdge, Integer> flow = new HashMap<>();
    for (DefaultEdge e: G.edgeSet()) {
      flow.put(e, 0);
    }
    int maxFlow = 0;
    while (true) {
      DefaultEdge[] path = breadthFirstSearch(G, s, t, flow);
      if (path == null) {
        break;
      }
      int cf = Integer.MAX_VALUE;
      for (DefaultEdge e: path) {
        int cv = (int) G.getEdgeWeight(e) - flow.get(e);
        cf = Integer.min(cf, cv);
      }
      for (DefaultEdge e: path) {
        if (G.containsEdge(e)) {
          flow.put(e, flow.get(e) + cf);
        }
        else if (G.containsEdge(G.getEdgeTarget(e), G.getEdgeSource(e))) {
          flow.put(G.getEdge(G.getEdgeTarget(e), G.getEdgeSource(e)), flow.get(G.getEdge(G.getEdgeTarget(e), G.getEdgeSource(e))) - cf);
        }
      }
      maxFlow += cf;
    }
    return maxFlow;
  }

  public static DefaultEdge[] breadthFirstSearch(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex s, Vertex t, Map<DefaultEdge, Integer> flow) {
    ArrayList<DefaultEdge> edgesInPath = new ArrayList<>();
    Queue<Vertex> q = new ArrayDeque<>();
    boolean check = false;
    q.add(s);
    while (!q.isEmpty()) {
      Vertex cur = q.remove();
      for (DefaultEdge e: G.edgesOf(cur)) {
        if ((!edgesInPath.contains(e)) && (!G.getEdgeTarget(e).equals(s)) && (G.getEdgeWeight(e) > flow.get(e))) {
          edgesInPath.add(e);
          q.add(G.getEdgeTarget(e));
        }
      }
      if (cur.equals(t)) {
        check = true;
      }
    }
    if (check) {
      return edgesInPath.toArray(new DefaultEdge[0]);
    }
    else {
      return null;
    }
  }
}
