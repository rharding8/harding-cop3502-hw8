package org.example;

public class Vertex {
  private double d = Double.MAX_VALUE;
  private Vertex pi = null;

  public double getD() {
    return d;
  }

  public void setD(double d) {
    this.d = d;
  }

  public Vertex getPi() {
    return pi;
  }

  public void setPi(Vertex pi) {
    this.pi = pi;
  }
}
