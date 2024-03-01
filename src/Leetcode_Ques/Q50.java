import java.util.Scanner;

import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
//
        do {
            System.out.println("Press 1 to add\nPress 2 to multiply\nPress 3 to sum\nPress 4 to divide\n");
            int ans = sc.nextInt();
            if (ans == 1) {
                System.out.println("Enter two numbers to be added");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a + b));
            } else if (ans == 2) {
                System.out.println("Enter two numbers to be multiply");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a * b));
            } else if (ans == 3) {
                System.out.println("Enter two numbers to be sub");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a - b));
            } else if (ans == 4) {
                System.out.println("Enter two numbers to be divide");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Sum = " + (a / b));
            }

                System.out.println("Enter y to return");
                ch = sc.next().charAt(0);
            }
            while (ch == 'y' || ch == 'Y');
    }
}
