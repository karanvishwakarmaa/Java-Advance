package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge07 {

//    Create a program to swap two numbers.

    public static void main(String[] args) {
        Scanner SwapNum = new Scanner(System.in);
        System.out.println("Welcome to Swap Station\n");
        System.out.println("Enter Value Of A:  \n");
        int a = SwapNum.nextInt();
        System.out.println("Enter Value Of B:  \n");
        int b = SwapNum.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("The Value Of A is:  " + a +
                "\nThe Value Of B is:  " + b);
    }

}
