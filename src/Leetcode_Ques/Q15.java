import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        if (age>=21){
            System.out.println(" Hello " + name + " ! " + "You are a valid voter");
        } else {
            System.out.println(" Sorry! " + name + " ! " + "You are not a valid voter");
            System.out.println("You are eligible after " + ( 21-age) + "years");
        }
    }
}
