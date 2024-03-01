import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        System.out.println("Enter an integer ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            t = i * t;
        }
        System.out.println(t);
    }
}
