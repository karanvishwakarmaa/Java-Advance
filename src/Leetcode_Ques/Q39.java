import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value n");
        int n = sc.nextInt();
        for (int i = 1; i<=n/2 ; i++) {
            if (n%i==0) {
                sum=sum+i;
            }
        }
        System.out.println(sum==n ? "perfect" : "not perfect");
    }
}
