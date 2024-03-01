package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q7_CompareTwoNumbers {
    public static void main(String args[]) {
        System.out.println("Enter first number");
        Scanner s1 = new Scanner(System.in);
        int one = s1.nextInt();
        System.out.println("Enter second number");
        Scanner s2 = new Scanner(System.in);
        int two = s2.nextInt();
        if (one>two) {
            System.out.println("Yes! Your first number is bigger than second number");
        } else {
            System.out.println("No!... Your first number is not bigger than second number");
        }
    }
}
