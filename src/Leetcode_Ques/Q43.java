import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num =  sc.nextInt();
//        System.out.println("Enter b number");
//        int n = sc.nextInt();
//        int a = num%10;
//        int b = num/10;
//        int c = a * 10 + b ;
        while (num != 0){
            int rem = num%10;
//            task
            rev = rev * 10 + rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
