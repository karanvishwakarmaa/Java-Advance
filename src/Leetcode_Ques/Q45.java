import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Armstrong Number");
        int n = sc.nextInt();
      int sum = 0 , t = n;
      while (n != 0) {
          int rem = n%10;
          sum = sum + rem * rem * rem;
          n = n/10;
      }
        System.out.println(sum == t? "Armstrong" : "Not Armstrong");
    }
}
