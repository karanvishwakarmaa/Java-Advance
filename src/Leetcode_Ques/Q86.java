import java.util.Arrays;
import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i =0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j= arr.length-1;
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));
    }
}