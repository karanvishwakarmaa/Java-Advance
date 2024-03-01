import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compoundinterest;
        System.out.println("Enter Principle Amount");
        double p = sc.nextDouble();
        System.out.println("Enter rate");
        double r = sc.nextDouble();
        System.out.println("Enter n");
        double n = sc.nextDouble();
        compoundinterest = p*Math.pow(1+r/100,n);
        System.out.println("compound interest is = " + compoundinterest);
    }
}
