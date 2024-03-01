import java.util.Scanner;
public class Q27 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter A English Alphabet");
        char n = SC.next().charAt(0);
        if (n==('A' | 'a') || n==('E' | 'e') || n==('I' | 'i') || n==('O' | 'o') || n==('U' | 'u')) {
            System.out.println("It is a vowel");
        } else {
            System.out.println("Is is a consonent");
        }
    }
}
