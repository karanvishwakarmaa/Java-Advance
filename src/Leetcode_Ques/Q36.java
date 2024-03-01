import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of m");
        int m = sc.nextInt();
        for (int i = n; i <= m; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}