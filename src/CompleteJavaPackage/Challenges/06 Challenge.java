package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge06 {

//Create a program to multiplication two numbers.

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Two Number For Multiplication");
        System.out.println("Enter First Number...");
        int num1 = UserInput.nextInt();
        System.out.println("Enter Second Number...");
        int num2 = UserInput.nextInt();
        int multi = num1 * num2;
        System.out.println("The Multiplication Of Two Numbers Is = " + multi);
    }

}
