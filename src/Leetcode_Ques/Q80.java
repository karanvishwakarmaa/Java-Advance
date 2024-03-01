import java.util.Arrays;
import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int k = sc.nextInt();
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int j=0; j<k;j++) {
            int t=arr[0];
            for (int i =0; i< arr.length; i++) {
                arr[i-1] = arr[i];
            }
            arr[arr.length-1] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
