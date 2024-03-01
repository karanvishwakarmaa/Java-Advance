      // AREA OR PERIMETER OF RECTANGLE//
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length Of The Rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter The Width Of The Rectangle");
        double w = sc.nextDouble();
        double area = (l*w);
        double perimeter = 2*(l+w);
        System.out.println("The Area Of Rectangle is " + area + " & " + "The Perimeter Of Rectangle is " + perimeter);
    }
}
