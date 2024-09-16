package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class XORBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR Operator\n");
        System.out.print("Please Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, Enter the second number");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("Result is: " + result);
    }
}
