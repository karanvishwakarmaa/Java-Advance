package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q2_FindX {
    public static void main(String args[]) {
        System.out.println("Enter the value of X :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x = x*3 + 10;
        System.out.println("Your new value of x is :" + x);
    }
}
