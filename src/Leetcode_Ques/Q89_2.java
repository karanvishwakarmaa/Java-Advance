import java.util.Arrays;

public class Q89_2 {
    public static void main(String[] args) {
        int arr[]={-5,1,2,-9,-8,6,7};
      int i=0, j=arr.length-1;
      while (i<j) {
          while (i<arr.length && arr[i]<0)
              i++;
          while (j>=0 && arr[j]>0)
              j--;
          if (i<j) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j]=temp;
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
