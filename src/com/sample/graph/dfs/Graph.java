package com.sample.graph.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Depth first search (traversal) implementation, refer to
 * https://algorithms.tutorialhorizon.com/graph-depth-first-traversal/
 * https://www.softwaretestinghelp.com/java-graph-tutorial/
 *
 */
public class Graph {

  private int vertex;
  private LinkedList<Integer> list[];

  private List<Integer> visited = new ArrayList<>();
  private Stack<Integer> stack = new Stack<>();

  public Graph(int vertex) {
    this.vertex = vertex;
    list = new LinkedList[vertex];
    for (int i = 0; i < vertex; i++) {
      list[i] = new LinkedList<>();
    }
  }

  public void addEdge(int from, int to) {
    list[from].addFirst(to);
  }

  public void DFS() {
    if (stack.size() == 0) {
      stack.push(0);
    }
    Integer item = stack.pop();
    System.out.println("vertex visited: " + item);
    visited.add(item);
    if (visited.size() == vertex) {
      // all vertex visited, job done
      return;
    } else {
      list[item.intValue()].forEach(edge -> {
        if (!visited.contains(edge) && !stack.contains(edge)) {
          System.out.println("stack pushed: " + edge);
          stack.push(edge);
        }
      });
      DFS();
    }
  }

  public void printGraph() {
    for (int i = 0; i < vertex; i++) {
      List<Integer> links = new ArrayList<>();
      list[i].forEach(edge -> {
        links.add(edge);
      });
      System.out.println("Source " + i + ", links: " + links);
    }
  }

  public void printDFS() {
    System.out.println("DFS:" + visited);
  }

  public static void main(String[] args) {
    Graph graph = new Graph(6);
    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(3, 4);
    graph.addEdge(2, 3);
    graph.addEdge(4, 0);
    graph.addEdge(4, 1);
    graph.addEdge(4, 5);
    graph.printGraph();
    graph.DFS();
    graph.printDFS();
  }
}

