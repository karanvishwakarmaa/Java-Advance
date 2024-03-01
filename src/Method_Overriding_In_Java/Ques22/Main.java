package Method_Overriding_In_Java.Ques22;

public class Main {
    public static void main(String[] args) {
        Bike b= new Bike();
        b.run(); // calling method
        Car c = new Car();
        c.run();
        Scooty s = new Scooty();
        s.run();
        Cycle C = new Cycle();
        C.run();
    }
}
