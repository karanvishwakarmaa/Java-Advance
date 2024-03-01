package java_advance.feb23.Assignment01;
import java.util.Scanner;
public class Q3_TwoSumsOneNumber {
    public static void main(String args[]) {
        System.out.println("Enter first number of sum");
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        System.out.println("Enter second number of sum");
        Scanner sd = new Scanner(System.in);
        int two = sd.nextInt();
        System.out.println("Enter third number of sum");
        Scanner se = new Scanner(System.in);
        int three = se.nextInt();
        System.out.println("Enter fourth number of sum");
        Scanner sf = new Scanner(System.in);
        int four = sf.nextInt();
        System.out.println("Enter fifth number of sum");
        Scanner sg = new Scanner(System.in);
        int five = sg.nextInt();
        int sum1= one+two;
        int sum2= three+four;
        if (sum1>five && sum2>five) {
            System.out.println("Yes! Your value is greater than fifth value");
        } else {
            System.out.println("No... Your value is not greater than fifth value");
        }
    }
}
