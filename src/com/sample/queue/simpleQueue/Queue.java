package com.sample.queue.simpleQueue;

public class Queue {

  private Node front;
  private Node rear;
  private int size;

  public Queue() {
    this.front = null;
    this.rear = null;
    this.size = 0;
  }

  public void add(Object item) {
    Node newNode = new Node(item, null);
    if (this.front == null) {
      this.front = this.rear = newNode;
    } else {
      this.rear.next = newNode;
      this.rear = newNode;

      if (front.next == null) {
        this.front.next = newNode;
      }
    }
    size++;
  }

  public Object remove() {
    if (this.size == 0) {
      return null;
    }

    Node toRemove = this.front;
    this.front = this.front.next;
    size--;
    return toRemove.item;
  }

  private class Node {
    private Object item;
    private Node next;

    public Node(Object item, Node next) {
      this.item = item;
      this.next = next;
    }
  }
}
