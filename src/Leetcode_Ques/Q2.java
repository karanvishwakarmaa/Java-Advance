       //TWO NUMBER OF SUM USER INPUT//
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number Of The Value is... ");
        double a = sc.nextDouble();
        System.out.println("Enter The Second Number Of The Value is... ");
        double b = sc.nextDouble();
        double sum = a + b ;
        System.out.println("The Sum Of " + a + " & " + b + " = " + sum);
    }
}
