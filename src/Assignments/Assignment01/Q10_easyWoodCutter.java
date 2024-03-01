package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q10_easyWoodCutter {
    public static void main(String args[]) {
        System.out.println("Enter any number");
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        if (N%3 == 0) {
            System.out.println("Yes! This number is divisible by three");
        } else {
            System.out.println("No!...This number is not divisible by three");
        }
    }
}
