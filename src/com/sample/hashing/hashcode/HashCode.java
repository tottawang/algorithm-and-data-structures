package com.sample.hashing.hashcode;

/**
 * Good reference (in Chinese) http://blog.csdn.net/yissan/article/details/50888070
 * 
 * @author wangto
 *
 */
public class HashCode {

  /**
   * Calculate index based on hashcode and capacity
   * 
   * @param hashCode
   * @param length
   * @return
   */
  public int indexFor(int hashCode, int length) {
    return hashCode & (length - 1);
  }

  /**
   * Same as JDK String hashCode implementation
   * 
   * @param string
   * @return
   */
  public int hashString(String string) {
    char[] value = string.toCharArray();
    int hash = 0;
    for (int i = 0; i < value.length; i++) {
      hash = 31 * hash + value[i];
    }
    return hash;
  }

  // to be implemented
  // http://www.iteye.com/topic/709945


}
