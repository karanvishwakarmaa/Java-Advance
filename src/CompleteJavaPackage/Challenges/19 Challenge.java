package CompleteJavaPackage.Challenges;

import java.util.Scanner;

class GradeBasedMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to the English Foundation School***");
        System.out.println("\nPlease Enter Your All Subject Marks by Filling Each Subjects*");
        System.out.println("Enter Your English Marks");
        float english = input.nextFloat();
        System.out.println("Enter your Hindi Marks");
        float hindi = input.nextFloat();
        System.out.println("Enter your Science Marks");
        float science = input.nextFloat();
        System.out.println("Enter your Social Marks");
        float social = input.nextFloat();
        System.out.println("Enter your Sanskrit Marks");
        float sanskrit = input.nextFloat();
        System.out.println("Finally, Enter your maths Marks");
        float math = input.nextFloat();

        float total = (english + hindi + sanskrit + science + social + math)/6;

        if (total >= 90) {
            System.out.println("You Have Passed With \" A \" Marks");
        } else if (total >= 75) {
            System.out.println("You Have Passed With \" B \" Marks");
        } else if (total >= 60) {
            System.out.println("You Have Passed With \" C \" Marks");
        } else if (total >= 30) {
            System.out.println("You Have Passed With \" D \" Marks");
        } else {
            System.out.println("Oh Ho!!! , You Are Fail on this exam");
        }
    }
}
