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
      breadthFirstSearch(G, s, t, flow);
      if (t.getPi() == null) {
        break;
      }
      int cf = Integer.MAX_VALUE;
      for (Vertex v = t; v.getPi() != null; v = v.getPi()) {
        DefaultEdge e = G.getEdge(v.getPi(), v);
        int cv = (int) G.getEdgeWeight(e) - flow.get(e);
        cf = Integer.min(cf, cv);
      }

      for (Vertex v = t; v.getPi() != null; v = v.getPi()) {
        DefaultEdge e = G.getEdge(v.getPi(), v);
        flow.put(e, flow.get(e) + cf);
      }
      maxFlow += cf;
    }
    return maxFlow;
  }

  public static void breadthFirstSearch(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex s, Vertex t, Map<DefaultEdge, Integer> flow) {
    for (Vertex v: G.vertexSet()) {
      v.setPi(null);
    }
    Set<Vertex> visited = new HashSet<>();
    Queue<Vertex> q = new ArrayDeque<>();
    q.add(s);
    while (!q.isEmpty()) {
      Vertex cur = q.remove();
      visited.add(cur);
      if (cur.equals(t)) {
        return;
      }
      for (DefaultEdge e: G.outgoingEdgesOf(cur)) {
        if (!(G.getEdgeTarget(e).equals(s)) && !(visited.contains(G.getEdgeTarget(e))) && (G.getEdgeWeight(e) > flow.get(e))) {
          q.add(G.getEdgeTarget(e));
          G.getEdgeTarget(e).setPi(cur);
        }
      }
    }
  }
}
