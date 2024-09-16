package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to New Year Calculator");
        System.out.println("Please Enter the Year that you want chcek...!");
        int year = input.nextInt();

        if (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Your Year is a Leap Year");
        } else {
            System.out.println("your year is not a Leap Year");
        }
    }
}
