package org.example;

import org.jgrapht.alg.flow.EdmondsKarpMFImpl;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.util.SupplierUtil;

public class App {
  public static void main(String[] args) {
    DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G = new DefaultDirectedWeightedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER);
    Vertex[] vertices = new Vertex[10];
    System.out.println("Test Graph 1");
    generateGraph1(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[6]));
    EdmondsKarpMFImpl<Vertex, DefaultEdge> flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[6]));
    System.out.println();
    System.out.println("Test Graph 2");
    generateGraph2(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 3");
    generateGraph3(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 4");
    generateGraph4(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 5");
    generateGraph5(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[3]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[3]));
    System.out.println();
    System.out.println("Test Graph 6");
    generateGraph6(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 7");
    generateGraph7(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[7]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[7]));
    System.out.println();
    System.out.println("Test Graph 8");
    generateGraph8(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 9");
    generateGraph9(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[5]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[5]));
    System.out.println();
    System.out.println("Test Graph 10");
    generateGraph10(G, vertices);
    System.out.println("My Result: " + MaximumFlow.edmundKarp(G, vertices[0], vertices[7]));
    flow = new EdmondsKarpMFImpl<>(G);
    System.out.println("Should Be: " + (int) flow.calculateMaximumFlow(vertices[0], vertices[7]));
    System.out.println();
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

  public static void generateGraph2(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[2], vertices[4]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[3], vertices[1]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[4], vertices[3]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 15);
  }

  public static void generateGraph3(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 20);
    edge = G.addEdge(vertices[1], vertices[3]);
    G.setEdgeWeight(edge, 50);
    edge = G.addEdge(vertices[1], vertices[4]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 20);
    edge = G.addEdge(vertices[2], vertices[4]);
    G.setEdgeWeight(edge, 33);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 20);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 1);
  }

  public static void generateGraph4(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 15);
    edge = G.addEdge(vertices[0], vertices[3]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 12);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[2], vertices[5]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[4], vertices[1]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 10);
  }

  public static void generateGraph5(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 3; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[1], vertices[3]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 5);
  }

  public static void generateGraph6(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 16);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 13);
    edge = G.addEdge(vertices[1], vertices[3]);
    G.setEdgeWeight(edge, 12);
    edge = G.addEdge(vertices[2], vertices[1]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[2], vertices[4]);
    G.setEdgeWeight(edge, 14);
    edge = G.addEdge(vertices[3], vertices[2]);
    G.setEdgeWeight(edge, 9);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 20);
    edge = G.addEdge(vertices[4], vertices[3]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 4);
  }

  public static void generateGraph7(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 38);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[0], vertices[6]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 8);
    edge = G.addEdge(vertices[1], vertices[3]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[1], vertices[4]);
    G.setEdgeWeight(edge, 13);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 26);
    edge = G.addEdge(vertices[3], vertices[6]);
    G.setEdgeWeight(edge, 24);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 20);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 8);
    edge = G.addEdge(vertices[3], vertices[7]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[4], vertices[2]);
    G.setEdgeWeight(edge, 2);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 1);
    edge = G.addEdge(vertices[4], vertices[7]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[5], vertices[7]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[6], vertices[7]);
    G.setEdgeWeight(edge, 27);
  }

  public static void generateGraph8(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[1], vertices[4]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 6);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 6);
    edge = G.addEdge(vertices[4], vertices[2]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 2);
  }

  public static void generateGraph9(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 6; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 8);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[1], vertices[3]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[2], vertices[4]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[3], vertices[2]);
    G.setEdgeWeight(edge, 7);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 6);
    edge = G.addEdge(vertices[3], vertices[5]);
    G.setEdgeWeight(edge, 3);
    edge = G.addEdge(vertices[4], vertices[5]);
    G.setEdgeWeight(edge, 14);
  }

  public static void generateGraph10(DefaultDirectedWeightedGraph<Vertex, DefaultEdge> G, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    DefaultEdge edge = G.addEdge(vertices[0], vertices[1]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[0], vertices[2]);
    G.setEdgeWeight(edge, 5);
    edge = G.addEdge(vertices[0], vertices[3]);
    G.setEdgeWeight(edge, 15);
    edge = G.addEdge(vertices[1], vertices[2]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[1], vertices[5]);
    G.setEdgeWeight(edge, 15);
    edge = G.addEdge(vertices[1], vertices[6]);
    G.setEdgeWeight(edge, 9);
    edge = G.addEdge(vertices[2], vertices[3]);
    G.setEdgeWeight(edge, 4);
    edge = G.addEdge(vertices[2], vertices[5]);
    G.setEdgeWeight(edge, 8);
    edge = G.addEdge(vertices[3], vertices[4]);
    G.setEdgeWeight(edge, 16);
    edge = G.addEdge(vertices[4], vertices[2]);
    G.setEdgeWeight(edge, 6);
    edge = G.addEdge(vertices[4], vertices[7]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[5], vertices[4]);
    G.setEdgeWeight(edge, 15);
    edge = G.addEdge(vertices[5], vertices[7]);
    G.setEdgeWeight(edge, 10);
    edge = G.addEdge(vertices[6], vertices[5]);
    G.setEdgeWeight(edge, 15);
    edge = G.addEdge(vertices[6], vertices[7]);
    G.setEdgeWeight(edge, 10);
  }
}
