package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge05 {

//Create a program to Sub two numbers.

    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter Two Number For Minus");
        System.out.println("Enter First Number...");
        int num1 = UserInput.nextInt();
        System.out.println("Enter Second Number...");
        int num2 = UserInput.nextInt();
        int sub = num1 - num2;
        System.out.println("The Subtract Of Two Numbers Is = " + sub);
    }

}
