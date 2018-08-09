package com.sample.bit;

import org.junit.Assert;
import org.junit.Test;

public class bitWiseTest {

  private static final double DELTA = 1e-15;

  @Test
  public void isPowerOfTowTest() {
    Assert.assertFalse(bitWise.isPowerOfTow(7));
    Assert.assertTrue(bitWise.isPowerOfTow(8));
  }

  @Test
  public void countOnesTest() {
    Assert.assertEquals(4, bitWise.countOnes(15), DELTA);
  }

}
