package com.sample.bit;

import org.junit.Assert;
import org.junit.Test;

public class bitWiseTest {

  @Test
  public void isPowerOfTowTest() {
    Assert.assertFalse(bitWise.isPowerOfTow(7));
    Assert.assertTrue(bitWise.isPowerOfTow(8));
  }

}
