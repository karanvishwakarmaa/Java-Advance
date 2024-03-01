package Iterative_Statement.For_Loop;

public class Ques11 {
    public static void main(String[] args) {
        System.out.println("Before-Loop");
        for (int i=0; true; i++) {
            System.out.println("Inside-Loop"); // this is infinite loop
        }
    }
}
