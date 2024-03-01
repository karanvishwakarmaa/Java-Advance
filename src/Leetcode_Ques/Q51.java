import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumNeg = 0, sumPosEven = 0, sumPosOdd = 0;
        do {
            n = sc.nextInt();
            if (n< 0) {
                sumNeg += n;
            } else if (n%2 == 0) {
                sumPosEven += n;
            } else {
                sumPosOdd += n;
            }
        } while (n!=0);
        System.out.println(n);
    }
}
