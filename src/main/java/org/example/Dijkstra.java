package org.example;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.graph.DefaultEdge;
import org.jheaps.tree.BinaryTreeAddressableHeap;
import org.jheaps.tree.FibonacciHeap;

public class Dijkstra {
  public static void binaryDijkstra (Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex s) {
    // Initialize Function not needed as custom Vertex class pre-assigns v.d to MAX_VALUE and
    // v.π (v.pi) to null (Equivalent to NIL)
    s.setD(0);
    Set<Vertex> S = new HashSet<>();
    BinaryTreeAddressableHeap<Double, Vertex> Q = fillBinHeap(G);
    while (!Q.isEmpty()) {
      Vertex u = Q.deleteMin().getValue();
      if (S.contains(u)) {
        continue;
      }
      S.add(u);
      for (DefaultEdge e: G.outgoingEdgesOf(u)) {
        Vertex v = G.getEdgeTarget(e);
        DefaultEdge edge = G.getEdge(u, v);
        relax(u, v, W.get(edge));
        Q.insert(v.getD(), v);
      }
    }
  }

  public static void fibonacciDijkstra (Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex s) {
    // Initialize Function not needed as custom Vertex class pre-assigns v.d to MAX_VALUE and
    // v.π (v.pi) to null (Equivalent to NIL)
    s.setD(0);
    Set<Vertex> S = new HashSet<>();
    FibonacciHeap<Double, Vertex> Q = fillFibHeap(G);
    while (!Q.isEmpty()) {
      Vertex u = Q.deleteMin().getValue();
      if (S.contains(u)) {
        continue;
      }
      S.add(u);
      for (DefaultEdge e: G.outgoingEdgesOf(u)) {
        Vertex v = G.getEdgeTarget(e);
        DefaultEdge edge = G.getEdge(u, v);
        relax(u, v, W.get(edge));
        Q.insert(v.getD(), v);
      }
    }
  }

  public static FibonacciHeap<Double, Vertex> fillFibHeap(Graph<Vertex, DefaultEdge> G) {
    FibonacciHeap<Double, Vertex> Q = new FibonacciHeap<>();
    for (Vertex v: G.vertexSet()) {
      Q.insert(v.getD(), v);
    }
    return Q;
  }

  public static BinaryTreeAddressableHeap<Double, Vertex> fillBinHeap(Graph<Vertex, DefaultEdge> G) {
    BinaryTreeAddressableHeap<Double, Vertex> Q = new BinaryTreeAddressableHeap<>();
    for (Vertex v: G.vertexSet()) {
      Q.insert(v.getD(), v);
    }
    return Q;
  }

  public static void relax(Vertex u, Vertex v, Double weight) {
    if (v.getD() > u.getD() + weight) {
      v.setD(u.getD() + weight);
      v.setPi(u);
    }
  }
}
