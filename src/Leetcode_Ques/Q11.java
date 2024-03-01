import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number");
        double b = sc.nextDouble();
        if(a>b){
            System.out.println("The Greatest Number is " + a);
        } else if (b>a){
            System.out.println("The Greatest Number is " + b);
        } else if (a<=b){
            System.out.println("The Numbers are equal ");
        }
    }
}
