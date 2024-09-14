package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge10 {
    public static void main(String[] args) {
        Scanner POR = new Scanner(System.in);
        System.out.println("Find the Perimeter Of Rectangle ABCD!!!");
        System.out.println("Enter the value of rectangle A:  ");
        float a = POR.nextFloat();
        System.out.println("Enter the value of rectangle B:  ");
        float b = POR.nextFloat();
        System.out.println("Enter the value of rectangle C:  ");
        float c = POR.nextFloat();
        System.out.println("Enter the value of rectangle D:  ");
        float d = POR.nextFloat();
        double total = a +b+c+d;
        System.out.println("The Perimeter of Rectangle ABCD is :  " + total);
    }
}
