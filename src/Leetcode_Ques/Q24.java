import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int amt = sc.nextInt();
        System.out.println("2000 ke note " + amt/2000);
        amt = amt % 2000;
        System.out.println("500 ke note " + amt/500);
        amt = amt % 500;
        System.out.println("200 ke note " + amt/200);
        amt = amt % 200;
        System.out.println("100 ke note " + amt/100);
        amt = amt % 100;
        System.out.println("50 ke note " + amt/50);
        amt = amt % 50;
    }
}