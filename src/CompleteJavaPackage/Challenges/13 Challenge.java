package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner CI = new Scanner(System.in);
        System.out.println("Welcome to Calculate Compound Interest");
        System.out.println("Please enter the principle amount rupees:  ");
        int p = CI.nextInt();
        System.out.println("Now Tell me your rate of interest...");
        float r = CI.nextFloat();
        System.out.println("Finally Now tell me what time you have borrow this amount...");
        float t = CI.nextFloat();

        double Ci = p * Math.pow((1 + r/100), t);
        System.out.println("\nYour Compound Interest Rupeess is:  "+ Ci);
    }
}
