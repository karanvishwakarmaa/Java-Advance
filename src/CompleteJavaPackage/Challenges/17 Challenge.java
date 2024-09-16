package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator that define Greatest Of Three");
        System.out.println("Please Enter Your First Number");
        int first = sc.nextInt();
        System.out.println("Now, Enter your second number");
        int second = sc.nextInt();
        System.out.println("Finally, Enter your third number");
        int third = sc.nextInt();
        if (first >= second && first >= third) {
            System.out.println(first + " is the greatest number");
        } else if (second >= first && second >= third) {
            System.out.println(second + " is the greatest number");
        } else {
            System.out.println(third + " is the greatest number");
        }
    }
}
