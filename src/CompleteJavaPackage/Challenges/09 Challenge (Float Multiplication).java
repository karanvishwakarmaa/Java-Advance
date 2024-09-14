package CompleteJavaPackage.Challenges;

import java.util.Scanner;
class Challenge09 {

//    create a program to calculate product of two floating points numbers..

    public static void main(String[] args) {
        Scanner UInput = new Scanner(System.in);
        System.out.println("Welcome to my Channel");
        System.out.println("Enter Your Saved Amount...");
        float saved = UInput.nextFloat();
        System.out.println("Enter Your Cash Amount...");
        float cash = UInput.nextFloat();
        float total = saved + cash;
        System.out.println("Calculate product of two floating points numbers is :  " + total);

    }
}
