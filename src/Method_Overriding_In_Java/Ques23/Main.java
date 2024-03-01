package Method_Overriding_In_Java.Ques23;

public class Main {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        BOI b = new BOI();
        HDFC h = new HDFC();
        PUNJAB p = new PUNJAB();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
        System.out.println("BOI Rate of Interest: "+b.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: "+h.getRateOfInterest());
        System.out.println("PUNJAB Rate of Interest: "+p.getRateOfInterest());

    }
}
