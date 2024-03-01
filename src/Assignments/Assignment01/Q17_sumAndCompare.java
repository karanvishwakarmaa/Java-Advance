package java_advance.feb23.Assignment01;
import java.util.Scanner;
public class Q17_sumAndCompare {
    public static void main(String args[]) {
        System.out.println("Enter the value of one number...");
        Scanner s1 = new Scanner(System.in);
        int one = s1.nextInt();
        System.out.println("Enter the value of two number...");
        Scanner s2 = new Scanner(System.in);
        int two = s2.nextInt();
        System.out.println("Enter the value of three number...");
        Scanner s3 = new Scanner(System.in);
        int three = s3.nextInt();
        System.out.println("Enter the value of four number...");
        Scanner s4 = new Scanner(System.in);
        int four = s4.nextInt();
        System.out.println("Enter the value of five number...");
        Scanner s5 = new Scanner(System.in);
        int five = s5.nextInt();
        int sum1 = one+two+three;
        int sum2 = four+five;
        if (sum1>sum2) {
            System.out.println("True...sum1 is greater than sum2");
        } else{
            System.out.println("False...sum1 is not greater than sum2");
        }
    }
}
