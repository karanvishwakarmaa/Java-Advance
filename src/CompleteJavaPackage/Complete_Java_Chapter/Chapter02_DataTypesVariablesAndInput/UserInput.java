package CompleteJavaPackage.Complete_Java_Chapter.Chapter02_DataTypesVariablesAndInput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
       Scanner person = new Scanner(System.in);
        System.out.print("Please Enter Your Name : ");
        String name = person.nextLine();
        System.out.println("Welcome " + name + " to KG Coding");

    }
}
