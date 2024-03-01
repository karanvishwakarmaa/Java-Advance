package Method_Overriding_In_Java.Ques22;

public class Car extends Vehicle{
    @Override
    void run() {
//        super.run();
        System.out.println("please drive safely");
    }
}
