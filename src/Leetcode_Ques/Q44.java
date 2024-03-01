import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int temp = num;
        while (num != 0){
            int rem = num%10;
//            task
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(rev == temp ? "Pallindromic" : "Not Pallindromic" );
    }
    }

