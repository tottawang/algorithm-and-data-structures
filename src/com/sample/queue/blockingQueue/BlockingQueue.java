package com.sample.queue.blockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

  private Queue<Object> queue = new LinkedList<>();

  public synchronized Object dequeue() {
    while (queue.isEmpty()) {
      try {
        wait();
      } catch (InterruptedException e) {
        // return null when throws exception
        return null;
      }
    }
    return queue.remove();
  }

  public synchronized void enqueue(Object msg) {
    queue.add(msg);
    notify();
  }
}
