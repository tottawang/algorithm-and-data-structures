package com.sample.queue.simpleQueue;

public class Test {

  public static void main(String[] args) {
    Queue queue = new Queue();
    for (int i = 0; i < 10; i++) {
      queue.add("" + i);
    }

    for (int i = 0; i < 11; i++) {
      System.out.println(queue.remove());
    }
  }
}
