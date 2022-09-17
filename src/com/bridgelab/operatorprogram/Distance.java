package com.bridgelab.operatorprogram;
// program Distance.java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y).

 //Use Math.power function
public class Distance {
     public static void main(String[] args) {
         // TODO Auto-generated method stub
         int x = Integer.parseInt(args[0]);
         int y = Integer.parseInt(args[1]);


         // compute distance
         //double distance = Math.sqrt((x * x) + (y * y));
         double distance = Math.sqrt(
                 Math.pow(x, 2) + Math.pow(y, 2));


         // output distance
         System.out.println("Distance from (0, 0) to (" +
                 x + ", " + y + ") is " +
                 distance);

     }

 }
