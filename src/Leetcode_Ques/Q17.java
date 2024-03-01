import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a , b , c , s , A ;
        System.out.println("Enter The Three Sides Of Triangle ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextInt();
        s = (a+b+c)/2;
        A = Math.sqrt(( s - a ) + ( s - b ) + ( s - c ) );
        System.out.println("Area of Triangle is " + A);
    }
}
