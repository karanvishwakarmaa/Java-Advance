package Iterative_Statement.do_while_Loop;

public class Ques15 {
    public static void main(String[] args)
    {
        System.out.println("Before Loop");
        do
        {
            System.out.println("Inside Loop"); // this is infinite loop//
        }
        while (true);
//        System.out.println("After Loop"); there is compilation error
    }
}
