import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yous Temperature In Fahrenheit ");
        double Fahrenheit = sc.nextDouble();
        double celsius = ( 32 - (Fahrenheit) ) * 5/9;
        System.out.println("Your Temperature in Celsius is " + celsius);
    }
}
