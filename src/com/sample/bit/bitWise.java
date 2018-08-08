package com.sample.bit;

public class bitWise {

  public static boolean isPowerOfTow(int value) {
    return value > 0 && (value & (value - 1)) == 0;
  }

}
