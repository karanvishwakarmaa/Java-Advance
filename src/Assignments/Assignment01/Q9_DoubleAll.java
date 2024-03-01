package java_advance.feb23.Assignment01;
import java.util.Scanner;
public class Q9_DoubleAll {
    public static void main(String args[]) {
        System.out.println("Enter the value of one");
        Scanner s1 = new Scanner(System.in);
        int one = s1.nextInt();
        System.out.println("Enter the value of two");
        Scanner s2 = new Scanner(System.in);
        int two = s2.nextInt();
        System.out.println("Enter the value of three");
        Scanner s3 = new Scanner(System.in);
        int three = s3.nextInt();
        System.out.println("Enter the value of four");
        Scanner s4 = new Scanner(System.in);
        int four = s4.nextInt();
        System.out.println("Enter the value of five");
        Scanner s5 = new Scanner(System.in);
        int five = s5.nextInt();
        one*=2;two*=2;three*=2;four*=2;five*=2;
        System.out.println(one+two+three+four+five);
    }
}
