package java_advance.feb23.Assignment01;

import java.util.Scanner;

public class Q16_singleArray {
    public static void main(String args[]) {
        System.out.println("Enter the value of N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        } for (int i=0; i<N; i++) {
            System.out.println(arr[i] + 1 + " ");
        }
    }
}
