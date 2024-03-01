package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q11_compareSevenNumbers {
    public static void main(String args[]) {
        System.out.println("Enter any number with the quantitty of seven numbers in any digit");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int sum1 = (a+b)*c;
        int sum2 = (d+e+f+g);
        System.out.println(sum1>sum2);
    }
}
