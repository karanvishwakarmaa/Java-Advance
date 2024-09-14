package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge03 {

//    Create a program to input name of the person and respond with ”Welcome NAME to RK Coding”

    public static void main(String[] args) {
        Scanner WelcomeNote = new Scanner(System.in);
        System.out.println("Hello ! World");
        System.out.println("Please Tell ! Me Your Precious Name :  ");
        String name = WelcomeNote.nextLine();
        System.out.println("Welcome " + name + " to RK Coding");
    }

}
