package CompleteJavaPackage.Complete_Java_Chapter.Chapter03_OperationIfElse_And_NumberSystem.Lecture03_RelationalOperators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to RTO Office Bhopal");
        System.out.println("Please Enter Your Precious Name:  \n");
        String name = input.nextLine();
        System.out.println("Now Tell! Me Your Age...");
        float age = input.nextFloat();
        if (age <= 18) {
            System.out.println("Oh Ho!!! , You are just few year's Left Mr. " + name + " For Your Driving Licence");
        } else {
            System.out.println("Yeah! " + name + " You Are Eligible for applying the driving licence");
        }
        System.out.println("Done");
    }
}
