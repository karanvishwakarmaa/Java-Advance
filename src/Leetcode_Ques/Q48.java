import java.util.Scanner;

public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int sq = n * n;
        int t = n;
        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        int ex = sq % (int) Math.pow(10, c);
        System.out.println(ex == t ? "auto" : "nahi hai lavde auto");
    }
}