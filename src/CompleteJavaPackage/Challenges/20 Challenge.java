package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class DiffAgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to a Age Calculator ");
        System.out.println("Please Enter your Age , Sir!!!");
        float age = sc.nextFloat();
        if (age >= 60) {
            System.out.println("You are a Senior Citizen Person");
        } else if (age >= 20) {
            System.out.println("You are a Adult Person");
        } else if (age >= 13) {
            System.out.println("Your are a Teen Children");
        } else {
            System.out.println("You are a little children");
        }
    }
}
