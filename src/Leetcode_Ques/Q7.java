import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Maths Subject Marks");
        double math = sc.nextDouble();
        System.out.println("Enter The Computer Subject Marks");
        double computer = sc.nextDouble();
        System.out.println("Enter The English Subject Marks");
        double english = sc.nextDouble();
        double percentage = (math + english + computer) * 100/300;
        System.out.println("The Marks Of Yous Three Subject Is " + percentage);
    }
}
