import java.util.Scanner;

public class Q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char vowel = sc.nextLine().charAt(0);
       char ch = 'a';
     switch (ch) {
         case 'a' , 'e' , 'i' , 'o' , 'u' -> System.out.println("Vowel");
         default -> System.out.println("conconent");
     }
    }
}
