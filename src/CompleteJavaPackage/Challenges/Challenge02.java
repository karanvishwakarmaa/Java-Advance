package CompleteJavaPackage.Challenges;

import java.util.Scanner;

public class Challenge02 {

//    Create a new Project and output  “subscribe” on the console.

    public static void main(String[] args) {
        Scanner SaySubscribe = new Scanner(System.in);
        System.out.println("Please Tell! Me Your Name :  ");
        String name = SaySubscribe.nextLine();
        System.out.println("Hello ! " + name + " , Please Subscribe My Channel ");
    }

}
