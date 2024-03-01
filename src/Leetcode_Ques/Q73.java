import java.util.Scanner;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        int sum = 0;
        for (int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum = sum+arr[i];

        }
        double mean = sum/ arr.length;
        System.out.println("Mean ="+ mean);
    }
}
