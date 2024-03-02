package abuDip_MCQ_Solutions;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator {
    public static void main(String args[]) {

        List<book> b = new ArrayList<book>();

        book b1 = new book("Java Server Programming");

        b.add(b1);

        Iterator<book> i = b.iterator();

        while(i.hasNext()) {

            book b4 = i.next();

            System.out.print(b4.name + " ");

        }

    }
}
