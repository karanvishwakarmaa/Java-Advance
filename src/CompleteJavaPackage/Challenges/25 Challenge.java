package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class LeftShiftOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("To showcase Left Shift Operator");
        System.out.println("Enter your number");
        int num = input.nextInt();
        int result =  num << 1;
        System.out.println("Your result is:  " + result);
    }
}
