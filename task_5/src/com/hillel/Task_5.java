package com.hillel;

public class Task_5 {
  public static void main(String[] args) {
    int pricePerDay = 40;
    int days = Integer.parseInt(args[0]);
    int price = days*pricePerDay;;
    if ( days > 5 ) {
      price = days*pricePerDay-20;
    }
    if ( days > 7 ) {
      price = days*pricePerDay-50;
    }
    System.out.println("Price = " + price);
  }
}
