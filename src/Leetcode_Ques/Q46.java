import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0 , t = n;
        while (n != 0) {
            int rem = n%10;
//            task-find factorial number
            int fact = 1;
            for (int i = 1; i<=rem; i++) {
                fact = fact *i;
            }
            sum = sum +fact;
            n = n/10;
        }
        System.out.println(sum == t ? "Strong" : "Not Strong");
    }
}
