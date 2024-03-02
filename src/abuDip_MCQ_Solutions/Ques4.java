package abuDip_MCQ_Solutions;

import java.util.ArrayList;
import java.util.List;

public class Ques4 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>( );

        List<String> list2 = list1;

        list1.add("a");

        list1.add("b");

        list1.add("c");

        System.out.format("%s", list1);

        System.out.format("%s", list2);

    }


}
