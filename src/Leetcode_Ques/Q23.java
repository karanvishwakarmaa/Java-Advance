import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        double per = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Amount");
        int amt = sc.nextInt();
        if (amt>=0 && amt<=5000){
            per = 0;
        } else if (amt>=5001 && amt<=7000){
            per = 10;
        } else if (amt>=7001 && amt<=10000){
            per = 20;
        } else if (amt>10000){
            per = 30;
        }
        double dis = amt * per /100;
        System.out.println(amt-dis);
    }
}
