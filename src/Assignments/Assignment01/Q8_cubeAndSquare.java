package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q8_cubeAndSquare {
    public static void main(String args[]) {
        System.out.println("Enter the value of n");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        System.out.println("Enter the value of m");
        Scanner s2 = new Scanner(System.in);
        int m = s2.nextInt();
        System.out.println(n*n*n > m*m);
    }
}
