package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q15_profilePic {
    public static void main(String args[]) {
        System.out.println("Enter pic value of L");
        Scanner s1 = new Scanner(System.in);
        int L = s1.nextInt();
        System.out.println("Enter pic value of W");
        Scanner s2 = new Scanner(System.in);
        int W = s2.nextInt();
        System.out.println("Enter pic value of length");
        Scanner s3 = new Scanner(System.in);
        int length = s3.nextInt();
        System.out.println("Enter pic value of width");
        Scanner s4 = new Scanner(System.in);
        int width = s4.nextInt();
        if (length>L &&  width>W) {
            System.out.println("Upload");
        } else if (length<L) {
            System.out.println("Increase Length");
        } else if (width<W) {
            System.out.println("Increase Width");
        }
    }
}
