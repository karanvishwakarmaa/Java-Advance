package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator of SumOfDigit's");
        System.out.print("Please Enter Your Number: ");
int num = input.nextInt();
int sumOfDigit = SumOfDigit(num);
        System.out.println("The Sum Of Digits of Your Number is: " + sumOfDigit);

    }
    public static int SumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }
}
