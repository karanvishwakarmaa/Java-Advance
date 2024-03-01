import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        double a,b,c,d,root1,root2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a , b and c from quadratic equation = ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextInt();
        d = (b*b-4*a*c);
        root1= ((-b+Math.sqrt(d))/(2*a));
        root2 = ((-b-Math.sqrt(d))/(2*a));
        System.out.println("roots of quadratic equation are = " + root1 + " And " + root2);
    }
}
