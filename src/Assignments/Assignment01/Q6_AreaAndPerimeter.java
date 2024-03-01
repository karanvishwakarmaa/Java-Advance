package java_advance.feb23.Assignment01;
import java.util.Scanner;
public class Q6_AreaAndPerimeter {
    public static void main(String args[]) {
        System.out.println("Enter the value of rectangle1 L1 :");
        Scanner sc = new Scanner(System.in);
        int L1 = sc.nextInt();
        System.out.println("Enter the value of rectangle1 B1 :");
        Scanner sd = new Scanner(System.in);
        int B1 = sd.nextInt();
        System.out.println("Enter the value of rectangle2 L2 :");
        Scanner se = new Scanner(System.in);
        int L2 = se.nextInt();
        System.out.println("Enter the value of rectangle2 B2 :");
        Scanner sf = new Scanner(System.in);
        int B2 = sf.nextInt();
        int areaOfRectangle1 = L1*B1;
        int areaOfRectangle2 = L2*B2;
        int perimeterOfRectangle1 = 2*(L1+B1);
        int perimeterOfRectangle2 = 2*(L2+B2);
        System.out.println(areaOfRectangle1>areaOfRectangle2);
        System.out.println(perimeterOfRectangle1>perimeterOfRectangle2);
    }
}
