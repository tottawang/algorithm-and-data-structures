package com.sample.hashing.hashcode;

import org.junit.Test;

public class HashCodeTest {

  @Test
  public void getIndex() {
    HashCode hashCode = new HashCode();
    System.out.println(hashCode.indexFor(64205538, 128));
  }

  @Test
  public void hashString() {
    HashCode hashCode = new HashCode();
    System.out.println(hashCode.hashString("thisisasample"));
  }

  @Test
  public void hahsLong() {
    // to be implemented
  }

}
