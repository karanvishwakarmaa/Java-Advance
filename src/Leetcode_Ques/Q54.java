import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        float percentage;
//        float marks;
do {
    System.out.println("1 -> prerss to sum\n2 -> press to substract\n3 -> press to multiply\n4 -> press to divide\n5 -> press to precentage");
    int ans = sc.nextInt();
    switch (ans) {
        case 1 -> {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
        case 2 -> {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-b);
        }
        case 3 -> {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a*b);
        }
        case 4 -> {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a/b);
        }
        case 5 -> {
            System.out.println("Enter your marks");
            float marks = sc.nextFloat();
            System.out.println("Enter your total marks");
            float total_marks = sc.nextFloat();
            percentage = (float) ((marks/total_marks) * 100);
            System.out.println("percentage ::" + percentage + "%");
        }
        default -> System.out.println("Oops! Meri Jaan Wrong Input");
    }

        System.out.println("repeat to press y");

    ch = sc.next().charAt(0);
} while ( ch == 'y');
    }
}
