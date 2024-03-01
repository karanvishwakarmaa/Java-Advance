package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q14_PrintGrade {
    public static void main(String args[]) {
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        if (total ==100) {
            System.out.println("Pass with A Grade");
        } else if (total >=90) {
            System.out.println("Pass with B Grade");
        } else if (total >= 80) {
            System.out.println("Pass with C Grade");
        } else {
            System.out.println("Fail ho gay tum toh.");
        }
    }
}
