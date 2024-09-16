package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Even_Odd_Using_Bitwise_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Odd Even by Bitwise Operator");
        System.out.println("Enter Your number:  ");
        int num = sc.nextInt();
        if ((num & 1) ==1) {
            System.out.println("Your number is odd number");
        } else {
            System.out.println("Your number is Even Number");
        }
    }
}
