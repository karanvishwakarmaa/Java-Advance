          // USER INPUT NAME AND AGE//
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yous Name!");
        String name = sc.nextLine();
        System.out.println("Enter Yous Age!");
        int age = sc.nextInt();
        System.out.println("Hello! " + name + " , " + " You Are " + age + " Years old. " );
    }
}
