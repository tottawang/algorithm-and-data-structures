package com.sample.bloomFilter;

import java.util.BitSet;

public class SimpleBloomFilter {

  private static final int DEFAULT_SIZE = 2 << 64;

  /**
   * not sure about the right ones, to be changed
   */
  private static final int[] SEEDS = new int[] {7, 11, 13, 31, 37, 61,};
  private SimpleHash[] hashFunctions;
  private BitSet bits = new BitSet(DEFAULT_SIZE);

  public SimpleBloomFilter() {
    hashFunctions = new SimpleHash[SEEDS.length];
    for (int i = 0; i < SEEDS.length; i++) {
      hashFunctions[i] = new SimpleHash(DEFAULT_SIZE, SEEDS[i]);
    }
  }

  private static class SimpleHash {

    private int cap;
    private int seed;

    public SimpleHash(int cap, int seed) {
      this.cap = cap;
      this.seed = seed;
    }

    public int computeHash(String value) {
      if (value == null || value.isEmpty()) {
        return -1;
      }
      int result = 0;
      for (int i = 0; i < value.length(); i++) {
        result = seed * result + value.charAt(i);
      }
      // result capped at cap value
      return (cap - 1) & result;
    }
  }

  public void add(String value) {
    for (int i = 0; i < hashFunctions.length; i++) {
      bits.set(hashFunctions[i].computeHash(value));
    }
  }

  public boolean contains(String value) {
    boolean result = true;
    for (int i = 0; i < hashFunctions.length; i++) {
      result = result && bits.get(hashFunctions[i].computeHash(value));
    }
    return result;
  }
}
