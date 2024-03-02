package abuDip_MCQ_Solutions;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Ques7 {
    public static void main(String[] args) {

        NavigableSet<Integer> ns = new TreeSet<Integer>();

        ns.add(10);

        ns.add(15);

        ns.add(7);

        Iterator descendingIterator = ns.descendingIterator();

        if(descendingIterator.hasNext()) {

            System.out.println(descendingIterator.next());

        }

    }
}
