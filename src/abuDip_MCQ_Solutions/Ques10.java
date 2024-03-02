package abuDip_MCQ_Solutions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ques10 {
    public static void main(String[] args) {

        Set set = new TreeSet();

        set.add("one");

        set.add("two");

        set.add("three");

        set.add("four");

        set.add("one");

        Iterator it = set.iterator();

        while(it.hasNext()) {

            System.out.print(it.next() + "");

        }

    }
}
