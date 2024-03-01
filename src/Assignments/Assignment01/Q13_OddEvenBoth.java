package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q13_OddEvenBoth {
    public static void main(String args[]) {
        System.out.println("Enter the value of first number");
        Scanner s1 = new Scanner(System.in);
        int one = s1.nextInt();
        System.out.println("Enter the value of second number");
        Scanner s2 = new Scanner(System.in);
        int two = s2.nextInt();
        if (one%2 ==0 && two%2 ==0) {
            System.out.println("Even");
        } else if (one%2 != 0 && two%2 != 0) {
            System.out.println("Odd");
        } else {
            System.out.println("Even-Odd");
        }
    }
}
