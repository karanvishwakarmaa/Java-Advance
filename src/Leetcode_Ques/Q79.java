import java.util.Arrays;
import java.util.Scanner;

public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int t = arr[0];
        for (int i =1; i< arr.length; i++) {
                arr[i-1] = arr[i];

        }
        arr[arr.length-1] =t;
        System.out.println(Arrays.toString(arr));
    }
}
