package CompleteJavaPackage.Complete_Java_Chapter.Chapter04_WhileLoop_Methods_Arrays.ReturnStatement;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first = readNumber1();
        int second = readNumber2();

        int sum = first + second;
        System.out.println("Sum of the numbers is: " + sum);
    }
    public static int readNumber1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the first number:  ");
        int first = input.nextInt();
        return first;
    }
    public static int readNumber2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Second Number:  ");
        int second = input.nextInt();
        return second;
    }
    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }

}
