import java.util.Scanner;

        public class Q72 {
            public static void main(String[] args) {
//        int arr[] = new int [5];
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("enter " + size + "element sep by space");
                int sum =0;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    sum = sum  + arr[i];
                }
                for (int i = 0; i <arr.length - 1; i++) {
                    System.out.print(arr[i] + " + ");
                }
                System.out.println(arr[size - 1] + " = " + sum);
    }
}
