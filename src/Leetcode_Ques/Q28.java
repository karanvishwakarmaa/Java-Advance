import java.util.Scanner;

public class Q28 {
    public static void main(String arg[]) {
//        System.out.println("Before swapping");
//        int x = 10;
//        int y = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
//        System.out.println("value of x:" + x);
//        System.out.println("value of y:" + y);
//        System.out.println("After swapping");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Now your value of first number:" + a);
        System.out.println(" Now your value of second number:" + b);
    }
}
