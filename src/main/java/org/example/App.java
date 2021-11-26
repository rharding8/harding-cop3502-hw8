package org.example;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.util.SupplierUtil;
import java.util.HashMap;
import java.util.Map;

public class App {
  public static void main(String[] args) {
    Graph<Vertex, DefaultEdge> G;
    Map<DefaultEdge, Double> W;
    Vertex[] vertices = new Vertex[8];
    System.out.println("Test No. 1");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph1(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[0]);
    if (vertices[3].getD() == 7.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 2");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph2(G, W, vertices);
    Dijkstra.fibonacciDijkstra(G, W, vertices[0]);
    if (vertices[5].getD() == 7.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 3");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph3(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[4]);
    if (vertices[1].getD() == 13.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 4");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph4(G, W, vertices);
    Dijkstra.fibonacciDijkstra(G, W, vertices[0]);
    if (vertices[7].getD() == 16.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 5");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph5(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[2]);
    if (vertices[7].getD() == 17.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 6");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph6(G, W, vertices);
    Dijkstra.fibonacciDijkstra(G, W, vertices[1]);
    if (vertices[4].getD() == 2.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 7");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph7(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[3]);
    if (vertices[6].getD() == 15.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 8");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph8(G, W, vertices);
    Dijkstra.fibonacciDijkstra(G, W, vertices[2]);
    if (vertices[7].getD() == 7.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 9");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph9(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[2]);
    if (vertices[5].getD() == 14.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
    System.out.println("Test No. 10");
    G = new DefaultDirectedGraph<>(SupplierUtil.createSupplier(Vertex.class), SupplierUtil.DEFAULT_EDGE_SUPPLIER, false);
    W = new HashMap<>();
    generateGraph10(G, W, vertices);
    Dijkstra.binaryDijkstra(G, W, vertices[6]);
    if (vertices[0].getD() == 10.0) {
      System.out.println("Test Successful");
    }
    else {
      System.out.println("Test Failed");
    }
  }

  public static void generateGraph1(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 3.0);
    W.put(G.addEdge(vertices[1], vertices[2]), 7.0);
    W.put(G.addEdge(vertices[1], vertices[6]), 1.0);
    W.put(G.addEdge(vertices[2], vertices[0]), 2.0);
    W.put(G.addEdge(vertices[4], vertices[7]), 3.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 1.0);
    W.put(G.addEdge(vertices[6], vertices[4]), 7.0);
    W.put(G.addEdge(vertices[6], vertices[7]), 7.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 1.0);
  }

  public static void generateGraph2(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[0], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[0], vertices[4]), 1.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[2], vertices[5]), 5.0);
    W.put(G.addEdge(vertices[3], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[4], vertices[6]), 5.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 1.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 7.0);
    W.put(G.addEdge(vertices[7], vertices[6]), 4.0);
  }

  public static void generateGraph3(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[0], vertices[2]), 8.0);
    W.put(G.addEdge(vertices[0], vertices[4]), 4.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 9.0);
    W.put(G.addEdge(vertices[1], vertices[6]), 3.0);
    W.put(G.addEdge(vertices[2], vertices[1]), 6.0);
    W.put(G.addEdge(vertices[2], vertices[5]), 7.0);
    W.put(G.addEdge(vertices[4], vertices[6]), 3.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[5], vertices[7]), 2.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 1.0);
    W.put(G.addEdge(vertices[6], vertices[2]), 6.0);
  }

  public static void generateGraph4(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[1]), 4.0);
    W.put(G.addEdge(vertices[0], vertices[2]), 3.0);
    W.put(G.addEdge(vertices[0], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[1], vertices[5]), 6.0);
    W.put(G.addEdge(vertices[2], vertices[1]), 7.0);
    W.put(G.addEdge(vertices[3], vertices[7]), 9.0);
    W.put(G.addEdge(vertices[6], vertices[4]), 1.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 4.0);
  }

  public static void generateGraph5(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[1]), 5.0);
    W.put(G.addEdge(vertices[0], vertices[3]), 2.0);
    W.put(G.addEdge(vertices[0], vertices[4]), 2.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 1.0);
    W.put(G.addEdge(vertices[2], vertices[5]), 9.0);
    W.put(G.addEdge(vertices[3], vertices[7]), 8.0);
    W.put(G.addEdge(vertices[4], vertices[2]), 4.0);
    W.put(G.addEdge(vertices[4], vertices[7]), 9.0);
    W.put(G.addEdge(vertices[5], vertices[3]), 4.0);
    W.put(G.addEdge(vertices[5], vertices[7]), 8.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 6.0);
  }

  public static void generateGraph6(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[4]), 1.0);
    W.put(G.addEdge(vertices[1], vertices[0]), 1.0);
    W.put(G.addEdge(vertices[1], vertices[2]), 8.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 1.0);
    W.put(G.addEdge(vertices[1], vertices[5]), 8.0);
    W.put(G.addEdge(vertices[2], vertices[6]), 9.0);
    W.put(G.addEdge(vertices[3], vertices[7]), 7.0);
    W.put(G.addEdge(vertices[4], vertices[6]), 9.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 1.0);
    W.put(G.addEdge(vertices[5], vertices[7]), 6.0);
    W.put(G.addEdge(vertices[6], vertices[4]), 9.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 3.0);
    W.put(G.addEdge(vertices[6], vertices[7]), 9.0);
  }

  public static void generateGraph7(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[2]), 5.0);
    W.put(G.addEdge(vertices[1], vertices[2]), 1.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 8.0);
    W.put(G.addEdge(vertices[1], vertices[0]), 2.0);
    W.put(G.addEdge(vertices[1], vertices[6]), 4.0);
    W.put(G.addEdge(vertices[2], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[2], vertices[0]), 4.0);
    W.put(G.addEdge(vertices[3], vertices[5]), 2.0);
    W.put(G.addEdge(vertices[5], vertices[3]), 2.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 3.0);
    W.put(G.addEdge(vertices[6], vertices[7]), 4.0);
  }

  public static void generateGraph8(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[1], vertices[2]), 9.0);
    W.put(G.addEdge(vertices[1], vertices[5]), 7.0);
    W.put(G.addEdge(vertices[2], vertices[1]), 4.0);
    W.put(G.addEdge(vertices[2], vertices[0]), 6.0);
    W.put(G.addEdge(vertices[2], vertices[4]), 2.0);
    W.put(G.addEdge(vertices[3], vertices[5]), 8.0);
    W.put(G.addEdge(vertices[4], vertices[7]), 5.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 6.0);
  }

  public static void generateGraph9(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[4]), 4.0);
    W.put(G.addEdge(vertices[1], vertices[0]), 2.0);
    W.put(G.addEdge(vertices[1], vertices[3]), 2.0);
    W.put(G.addEdge(vertices[2], vertices[0]), 1.0);
    W.put(G.addEdge(vertices[2], vertices[1]), 9.0);
    W.put(G.addEdge(vertices[3], vertices[5]), 6.0);
    W.put(G.addEdge(vertices[4], vertices[6]), 3.0);
    W.put(G.addEdge(vertices[5], vertices[3]), 3.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 2.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 6.0);
    W.put(G.addEdge(vertices[7], vertices[5]), 2.0);
  }

  public static void generateGraph10(Graph<Vertex, DefaultEdge> G, Map<DefaultEdge, Double> W, Vertex[] vertices) {
    for (int i = 0; i < 8; i++) {
      vertices[i] = G.addVertex();
    }
    W.put(G.addEdge(vertices[0], vertices[2]), 2.0);
    W.put(G.addEdge(vertices[0], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[1], vertices[0]), 3.0);
    W.put(G.addEdge(vertices[1], vertices[2]), 4.0);
    W.put(G.addEdge(vertices[2], vertices[5]), 6.0);
    W.put(G.addEdge(vertices[4], vertices[6]), 1.0);
    W.put(G.addEdge(vertices[5], vertices[3]), 7.0);
    W.put(G.addEdge(vertices[5], vertices[1]), 6.0);
    W.put(G.addEdge(vertices[5], vertices[7]), 3.0);
    W.put(G.addEdge(vertices[6], vertices[5]), 1.0);
    W.put(G.addEdge(vertices[6], vertices[2]), 7.0);
  }
}
