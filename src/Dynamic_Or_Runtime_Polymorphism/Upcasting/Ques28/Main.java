package Dynamic_Or_Runtime_Polymorphism.Upcasting.Ques28;

//import Method_Overriding_In_Java.Ques28.*;

import Method_Overriding_In_Java.Ques23.BOI;
import Method_Overriding_In_Java.Ques23.HDFC;
import Method_Overriding_In_Java.Ques23.PUNJAB;

public class Main {
    public static void main(String[] args) {
        AXIS a = new AXIS();
        ICICI i = new ICICI();
        SBI s = new SBI();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());

    }
}
