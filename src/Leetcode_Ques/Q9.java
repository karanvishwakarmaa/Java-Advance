import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount of interest");
        double principle  = sc.nextDouble();
        System.out.println("Enter the Time of interest");
        double time = sc.nextDouble();
        System.out.println("Enter The Rate of interest");
        double rate = sc.nextDouble();
        double amount = principle*(1+ (rate*time));
        System.out.println("The Simple Interest Of The Amount Is " + amount);
    }
}
