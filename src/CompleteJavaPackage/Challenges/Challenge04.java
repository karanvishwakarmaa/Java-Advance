package CompleteJavaPackage.Challenges;

import java.util.Scanner;

public class Challenge04 {

//Create a program to add two numbers.

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Two Number For Adding");
        System.out.println("Enter First Number...");
        int num1 = UserInput.nextInt();
        System.out.println("Enter Second Number...");
        int num2 = UserInput.nextInt();
        int add = num1 + num2;
        System.out.println("The Sum Of Two Numbers Is = " + add);
    }

}