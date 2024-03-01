import java.util.Arrays;
import java.util.Scanner;
public class Q78 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp [] = new int[arr.length];
        int i = arr.length-1;
        int j=0;
        while (i>=0){
            temp[j]=arr[i];
            i--;
            j++;
        }
        arr=temp;
        System.out.println(Arrays.toString(arr));
        }
    }

