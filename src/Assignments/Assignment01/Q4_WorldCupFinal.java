package java_advance.feb23.Assignment01;
import java.util.Scanner;
public class Q4_WorldCupFinal {
    public static void main(String args[]) {
        System.out.println("Enter NzScore");
        Scanner sc = new Scanner(System.in);
        int NzScore = sc.nextInt();
        System.out.println("Enter NzSuperOver");
        Scanner sd = new Scanner(System.in);
        int NzSuperOver = sd.nextInt();
        System.out.println("Enter NzFours");
        Scanner se = new Scanner(System.in);
        int NzFours = se.nextInt();
        System.out.println("Enter EngScore");
        Scanner sf = new Scanner(System.in);
        int EngScore = sf.nextInt();
        System.out.println("Enter EngSuperOver");
        Scanner sg = new Scanner(System.in);
        int EngSuperOver = sg.nextInt();
        System.out.println("Enter EngFours");
        Scanner sh = new Scanner(System.in);
        int EngFours = sh.nextInt();
        if (NzScore>EngScore) {
            System.out.println("New Zealand");
        } else if (NzScore<EngScore) {
            System.out.println("England");
        } else if (NzSuperOver>EngSuperOver) {
            System.out.println("New Zealand");
        } else if (NzSuperOver<EngSuperOver) {
            System.out.println("England");
        } else if (NzFours>EngFours) {
            System.out.println("New Zealand");
        } else if (NzFours<EngFours) {
            System.out.println("England");
        }
    }
}
