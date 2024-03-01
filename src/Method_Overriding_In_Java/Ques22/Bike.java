package Method_Overriding_In_Java.Ques22;
//creating a child class
public class Bike extends Vehicle{
    @Override
    void run() {
//        super.run();
        System.out.println("Bike is running safely");
    }
}
