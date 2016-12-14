package com.hillel;

public class Task_1 {
  public static void main(String[] args) {
    int a = 7;
    int b = -453;
    int c = -12;
    int min;
     if (a < b) {
       min = a;
     }
       else {
         if (c < b) {
           min = c;
         }
         else {
           min = b;

           }
         }
         System.out.println("Min = "+min);

         int max;
         if (a > b) {
           max = a;
         }
           else {
             if (c > b) {
               max= c;
             }
             else {
               max = b;

               }
             }
             System.out.println("Max = " + max);
  }
 }
