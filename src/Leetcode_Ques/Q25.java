import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter amount");
        int amt = SC.nextInt();
        System.out.println("2000  ke notes ="+ amt / 2000);
        amt = amt % 2000;
        if (amt > 500){
            System.out.println("500 ke notes ="+ amt / 500);
            amt = amt % 500;
        }
        if (amt > 200){
            System.out.println("200 ke notes ="+ amt / 200);
            amt = amt % 200;
        }
        if (amt > 100){
            System.out.println("100 ke notes ="+ amt / 100);
            amt = amt % 100;
        }
        if (amt > 50){
            System.out.println("50 ke notes ="+ amt / 50);
            amt = amt % 50;
        }
        if (amt > 20){
            System.out.println("20 ke notes ="+ amt / 20);
            amt = amt % 20;
        }
        if (amt > 10){
            System.out.println("10 ke notes ="+ amt / 10);
            amt = amt % 10;
        }
        if (amt > 5){
            System.out.println("5 ke notes ="+ amt / 5);
            amt = amt % 5;
        }
        if (amt > 2){
            System.out.println("2 ke notes ="+ amt / 2);
            amt = amt % 2;
        }
        if (amt > 1){
            System.out.println("1 ke notes ="+ amt / 1);
            amt = amt % 1;
        }
    }
}
