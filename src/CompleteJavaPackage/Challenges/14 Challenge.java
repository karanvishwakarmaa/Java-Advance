package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to a program those convert fahrenheit to Celsius..");
        System.out.println("\nPlease enter the value of Fahrenheit:  ");
        float f = sc.nextFloat();
        float cvt = (f - 32) * 5/9;
        System.out.println("\nYour Celsius value is: " + cvt);
    }
}
