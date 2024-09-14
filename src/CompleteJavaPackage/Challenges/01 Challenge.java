package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class Challenge01 {

//    Create a class to output “good morning” using a text  editor and check output. ---->
public static void main(String[] args) {
    Scanner UserDetail = new Scanner(System.in);
    System.out.println("Please Tell ! Me Your Precious Name:  ");
    String name = UserDetail.nextLine();
    System.out.println("Good Morning " + name);
}


}
