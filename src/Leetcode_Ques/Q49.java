import java.util.Scanner;

public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hello!");
        char ch = sc.nextLine().charAt(0);
        do{
            System.out.println("Hello\nPress y to repeat");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y' );
    }
}
