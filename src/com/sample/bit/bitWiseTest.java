package com.sample.bit;

import org.junit.Assert;
import org.junit.Test;

public class bitWiseTest {

  @Test
  public void isPowerOfTowTest() {
    Assert.assertFalse(bitWise.isPowerOfTow(7));
    Assert.assertTrue(bitWise.isPowerOfTow(8));
  }

  @Test
  public void changeBitNumberWhenAtoB() {
    // 1111 ^ 001 = 1110
    // Count of 1 in 1110 -> 3
    Assert.assertEquals(3, bitWise.countOnes(1 ^ 15));
  }

  @Test
  public void countOnesTest() {
    Assert.assertEquals(4, bitWise.countOnes(15));
  }

  @Test
  public void singleNumberTest() {
    int[] values = {4, 6, 7, 5, 4, 7, 6};
    Assert.assertEquals(5, bitWise.singleNumber(values));
    System.out.println(4 ^ 6 ^ 7 ^ 4 ^ 7 ^ 6 ^ 5);
  }

}
