package CompleteJavaPackage.Complete_Java_Chapter.Chapter03_OperationIfElse_And_NumberSystem.Lecture01_Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner ArithmeticOperators = new Scanner(System.in);
        System.out.println("Welcome to RK School.....");
        System.out.println("Enter the Value of A : ");
        int a = ArithmeticOperators.nextInt();
        System.out.println("Enter the Value of B : ");
        int b = ArithmeticOperators.nextInt();
        int sum = a + b;
        int sub = a - b;
        int multi = a * b;
        float modules = a % b;
        System.out.println("The Sum of \"A\" & \"B\" is :  " + sum
        +"\nThe Sub of \"A\" & \"B\" is :  " + sub + "\nThe multi of \"A\" & \"B\" is :  " + multi + "\nThe Modules of \"A\" & \"B\" is :  " + modules);
    }
}
