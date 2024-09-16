package CompleteJavaPackage.Complete_Java_Chapter.Chapter04_WhileLoop_Methods_Arrays.Methods;

import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {

        gender();
    }

    public static void gender() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name:  ");
        String name = sc.nextLine();
        System.out.println(" *Please Select Your Gender*  ");
        String gender = sc.nextLine();
        String Male = null;
//        String male =  Male;
        String Female = null;
        while (gender == Male) {  //condition
            System.out.println("Your Name is " + name + " and You are a " + Male);  //actual work
//            num = num + 1; //updating the condition
//            if (gender == Male) {
//                System.out.println("Your Name is " + name + " and You are a " + Male);
//            } else if (gender == Female){
//                System.out.println("Your Name is " + name + " and You are a " + Female );
//            } else {
//                System.out.println("Oh Ho!, Please Use this type \"Male/Female\" of format");
//            }
        } {
            System.out.println("Your Name is " + name + " and You are a " + Female);
        }


    }

}