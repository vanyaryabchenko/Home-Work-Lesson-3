package com.hillel;

public class Task_2 {
  public static void main(String[] args) {
    int value = Integer.parseInt(args[0]);
    if (value % 2 == 1 ) {
      System.out.println("Value "+value+" is odd");
    }
    else {
      System.out.println("Value "+value+" is even");
    }
  }
}
