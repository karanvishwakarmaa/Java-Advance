import java.util.Scanner;

public class Q74 {
    public static void main(String[] args) {
        int arr [] = new int [] { 2,33 ,  11 ,44,56,71019148};
        int max =0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > arr[max])
                max = i;
        }
        System.out.println("max element = " + arr[max] + " found at " + max + "Index");
    }
}
