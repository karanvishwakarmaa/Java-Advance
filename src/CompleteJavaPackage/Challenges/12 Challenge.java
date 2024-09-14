package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner SI = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest App");
        System.out.print("Please Enter Your Principle Amt Rs ");
        int p = SI.nextInt();
        System.out.println("Now! Tell me your rate of Interest...");
        float rate = SI.nextFloat();
        System.out.println("Finally Now ! tell me for how many years are you borrowing this money???");
        float yrs = SI.nextFloat();

        float interest = (p * rate * yrs)/100;
        System.out.println("\n\n Your Simple Interest Rupeess Is :  " + interest);
    }
}
