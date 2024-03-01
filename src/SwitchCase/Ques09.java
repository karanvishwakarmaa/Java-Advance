package SwitchCase;

import java.util.Scanner;

public class Ques09 {
    public static void main(String[] args) {
        System.out.println("Enter the value of i: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case (5) :
                System.out.println("Five");
                break;
            case (10) :
                System.out.println("Ten");
                break;
            case (15) :
                System.out.println("Fifteen");
                break;
            case (20) :
                System.out.println("Twenty");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
