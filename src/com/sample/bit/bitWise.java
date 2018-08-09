package com.sample.bit;

public class bitWise {

  public static boolean isPowerOfTow(int value) {
    return value > 0 && (value & (value - 1)) == 0;
  }

  public static int countOnes(int value) {
    int count = 0;
    while (value != 0) {
      value = value & (value - 1);
      count++;
    }
    return count;
  }

}
