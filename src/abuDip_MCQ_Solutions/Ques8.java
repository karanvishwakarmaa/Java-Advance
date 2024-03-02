package abuDip_MCQ_Solutions;

import java.util.ArrayList;

public class Ques8 {
    public void addmore(ArrayList l1) {

        l1.add("We");

    }

    public static void main(String[] args) {

        ArrayList <String>als = new ArrayList<String>();

        als.add("I");

        als.add("You");

        Ques8 obj = new Ques8( );

        obj.addmore(als);

        System.out.println(als);

    }
}
