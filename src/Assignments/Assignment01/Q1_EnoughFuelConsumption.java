package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q1_EnoughFuelConsumption {
 public static void main(String args[]) {
     System.out.println("Enter fuel Quantity");
     Scanner sc = new Scanner(System.in);
     int fuel = sc.nextInt();
     System.out.println("Enter distance quantity.");
     Scanner sv = new Scanner(System.in);
     int distance = sv.nextInt();
     int required = fuel * distance;
     if (required>50) {
         System.out.println("Enough");
     } else {
         System.out.println("Go On");
     }
 }
}
