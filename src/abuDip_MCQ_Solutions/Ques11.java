package abuDip_MCQ_Solutions;

import java.util.TreeSet;

public class Ques11 {
    private static int count = 0;

    private String id = "0";

    private String interest;

    public Ques11(String interest){ this.interest = interest; this.id = ""

            + ++count;}

    public String getInterest(){return interest;}

    public void setInterest(String interest){this.interest = interest;}

    public String toString(){return id;}

    String name = "ANU";

    TreeSet<Ques11> set = new TreeSet<Ques11>();

    public void add(Ques11 t) {

        if(name.equals(t.getInterest()))set.add(t); }

    public static void main(String s[]) {

        Ques11 mygroup = new Ques11("pavan");

        mygroup.add(new Ques11("ANU"));

        System.out.println("A");

        mygroup.add(new Ques11("ANU"));

        System.out.println("B");

        System.out.println(mygroup.set);

    }
}
