package org.example;

import org.jgrapht.alg.flow.EdmondsKarpMFImpl;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.util.SupplierUtil;

public class App {
  public static void main(String[] args) {
    DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G = new DefaultDirectedWeightedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER);
    Vertex[] vertices = new Vertex[10];
    generateGraph1(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[6]));
    EdmondsKarpMFImpl<Vertex, DefaultEdge> flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[6]));
  }

  public static void generateGraph1(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 7; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[0], vertices[3]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[2], vertices[0]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[2], vertices[4]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 6);
    edge = G.addEdge(vertices[4], vertices[1]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[4], vertices[6]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[5], vertices[6]);
    G.setEdgeWeight(edge, 9);
  }
}
