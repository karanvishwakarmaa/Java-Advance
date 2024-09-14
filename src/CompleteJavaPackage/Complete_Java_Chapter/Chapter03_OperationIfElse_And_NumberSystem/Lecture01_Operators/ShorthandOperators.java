package CompleteJavaPackage.Complete_Java_Chapter.Chapter03_OperationIfElse_And_NumberSystem.Lecture01_Operators;

import java.util.Scanner;

public class ShorthandOperators {
    public static void main(String[] args) {
        int a;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the value of A:  ");
        a = userInput.nextInt();
        System.out.println(a);
        System.out.println("What is the value of added to this number...?");
        int x1 = userInput.nextInt();
//        a = a + x1;
        a += x1;
        System.out.println(a);
        int x2 = userInput.nextInt();
//        a = a + x2;
        a +=x2;
        System.out.println(a);
        int x3 = userInput.nextInt();
        a = a + x3;
        System.out.println(a);
        int x4 = userInput.nextInt();
        a = a + x4;
        System.out.println(a);
        int x5 = userInput.nextInt();
        a = a + x5;
        System.out.println(a);
    }
}
