import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        int t = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            t = i + t;
        }
        System.out.println("The sum of " + t);
    }
}