package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q5_ApplyBrakes {
    public static void main(String args[]) {
        System.out.println("Enter the distance");
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        System.out.println("Enter Total Time");
        Scanner sd = new Scanner(System.in);
        int time = sd.nextInt();
        double speed = distance/time;
        if (speed>40) {
            System.out.println("Apply Brake");
        } else {
            System.out.println("Keep Going");
        }
    }
}
