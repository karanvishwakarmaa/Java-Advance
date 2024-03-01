import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int y = sc.nextInt();
        if (y % 100 == 0) {
            if (y % 400 == 0) {
                System.out.println("leap");
            } else {
                System.out.println("not leap");
            }
        }
    else{
        if (y % 4 == 0) {
                System.out.println("leap");
            } else {
                System.out.println("not leap");
            }
        }
    }
}

