import java.util.Scanner;

//import java.util.Scanner;
//
//public class Q12 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Gender");
//        char gender = sc.nextLine().charAt(0);
//        char male;
//        char female;
//        if (gender==male){
//            System.out.println("Good Morning Sir!");
//        } else if (gender==female){
//            System.out.println("Good Morning Ma'am!");
//        } else {
//            System.out.println("GM");
//        }
//    }
//}
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Gender");
        char gender = sc.nextLine().charAt(0);
        if (gender == 'M' || gender == 'm'){
            System.out.println("Good Morning Sir!");
        } else if (gender == 'F' || gender == 'f'){
            System.out.println("Good Morning Ma'am!");
        } else {
            System.out.println("Not Valid");
        }
    }
}