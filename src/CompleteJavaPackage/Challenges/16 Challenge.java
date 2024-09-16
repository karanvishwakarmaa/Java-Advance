package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Odd_Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Welcome to program that determine if a number is odd or even-----");
        System.out.println("Enter Your Number:  ");
 int num = input.nextInt();
    if (num % 2 == 0) {
        System.out.println("Your Number is in even ");
    } else {
        System.out.println("Your number is an Odd");
    }
    }
}
