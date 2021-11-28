package org.example;

import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jheaps.tree.FibonacciHeap;

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
        DefaultEdge e;
        int cv;
        if (G.containsEdge(v.getPi(), v)) {
          e = G.getEdge(v.getPi(), v);
          cv = (int) G.getEdgeWeight(e) - flow.get(e);
        }
        else {
          e = G.getEdge(v, v.getPi());
          cv = flow.get(e);
        }
        cf = Integer.min(cf, cv);
      }

      for (Vertex v = t; v.getPi() != null; v = v.getPi()) {
        DefaultEdge e;
        if (G.containsEdge(v.getPi(), v)) {
          e = G.getEdge(v.getPi(), v);
          flow.put(e, flow.get(e) + cf);
        }
        else {
          e = G.getEdge(v, v.getPi());
          flow.put(e, flow.get(e) - cf);
        }
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
    FibonacciHeap<Double, Vertex> qa = new FibonacciHeap<>();
    q.add(s);
    qa.insert(0.0, s);
    while (!qa.isEmpty()) {
      Vertex cur = qa.deleteMin().getValue();
      visited.add(cur);
      if (cur.equals(t)) {
        return;
      }
      for (DefaultEdge e: G.edgesOf(cur)) {
        if (!(G.getEdgeTarget(e).equals(s)) && !(visited.contains(G.getEdgeTarget(e))) && (G.getEdgeWeight(e) > flow.get(e))) {
          // q.add(G.getEdgeTarget(e));
          if (G.getEdgeTarget(e).equals(cur)) {
            qa.insert((double) flow.get(e), G.getEdgeTarget(e));
            G.getEdgeSource(e).setPi(cur);
          }
          else {
            qa.insert(G.getEdgeWeight(e) - flow.get(e), G.getEdgeTarget(e));
            G.getEdgeTarget(e).setPi(cur);
          }
        }
      }
    }
  }
}
