package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class ComplimentBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Not/Compliment Operator");
        System.out.println("Please enter your number");
        int num = input.nextInt();
        int result= ~num;
        System.out.println("Your result is :  " + result);
    }
}
