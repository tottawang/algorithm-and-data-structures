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

  /**
   * Given 2*n + 1 numbers, every numbers occurs twice except one, find it.
   * 
   * @param values
   * @return
   */
  public static int singleNumber(int[] values) {
    if (values == null || values.length == 0) {
      return -1;
    }
    int rst = 0;
    for (int i = 0; i < values.length; i++) {
      rst = rst ^ values[i];
    }
    return rst;
  }

  /**
   * Given an array of integers, every element appears three times except for one.
   * </p>
   * Find that single one.
   * 
   * @param values
   * @return
   */
  public static int singleNumber2(int[] values) {
    if (values == null || values.length == 0) {
      return -1;
    }
    return -1;
  }

}
