package CompleteJavaPackage.Complete_Java_Chapter.Chapter03_OperationIfElse_And_NumberSystem.Lecture04_LogicalOperators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ticket discount calculator");
        System.out.println("Please, Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Are You a Female? (true/False) ");
        boolean isFemale = sc.nextBoolean();

        if (age < 5) {
            System.out.println("You Got 75% Discount...");
        } else if (isFemale) {
            System.out.println("You Got 50% Discount...");
        } else if (age > 60 && !isFemale) {
            System.out.println("You Got 25% Discount");
        } else {
            System.out.println("You Got No Discount");
        }

    }
}
