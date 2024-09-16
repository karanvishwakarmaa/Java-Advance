package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to the program that determine if a number is positive , negative or zero-----");
        System.out.println("Enter your Number:  ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Your Number is Positive");
        } else if (num == 0) {
            System.out.println("Your number is Zero");
        } else {
            System.out.println("Your Number and Soch is Also Negative");
        }

    }
}
