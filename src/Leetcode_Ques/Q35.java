import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0 , sumOdd = 0;
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        for (int i=n; i<=m; i++) {
            if (i%2==0) {
                sumEven += i;
            }
            else {
                sumOdd += i;
            }
        }
        System.out.println("sum even = " + sumEven);
        System.out.println("sum odd = " + sumOdd);
    }
}
