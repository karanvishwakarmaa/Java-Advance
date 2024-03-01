package ConditionalStatements;

import java.util.Scanner;

public class Ques08 {
    public static void main(String[] args) {
        System.out.println("Enter the value of i: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        if (i ==10) {
            j =20;
        } else if (i==20) {
            j=30;
        } else {
            j=40;
        }
        System.out.println(j);
    }
}
