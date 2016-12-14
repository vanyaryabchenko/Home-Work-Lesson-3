package com.hillel;
public class Task_4 {
  public static void main(String[] args) {
    int firstValue = 111;
    int secondValue = 88;
    if ( Math.abs(10-firstValue) < Math.abs(10-secondValue) ) {
      System.out.println(firstValue + " closer to 10 than "+secondValue);
    }
    else {
      if ( Math.abs(10-firstValue) > Math.abs(10-secondValue) ){
        System.out.println(secondValue + " closer to 10 than "+firstValue);
      }
    }
  }
}
