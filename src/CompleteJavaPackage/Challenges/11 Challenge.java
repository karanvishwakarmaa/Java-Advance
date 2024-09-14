package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner POR = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator\n");
        System.out.println("Please enter your base in cms:  ");
        double base = POR.nextDouble();
        System.out.println("Please enter your perpendicular height in cms:  ");
        double height = POR.nextDouble();
        double Area = 0.5 * base * height;
        System.out.println("The Area of  a Triangle is :  " + Area + "cms");
    }
}
