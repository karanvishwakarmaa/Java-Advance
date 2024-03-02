package abuDip_MCQ_Solutions;

import java.util.*;

public class Ques1 {
    public static void main(String[] args) {

        List xl = new ArrayList();

        xl.add("M");

        xl.add("N");

        xl.add("O");

        xl.add("P");

        xl.add("Q");

        ListIterator lt = xl.listIterator();

        lt.next();

        lt.next();

        lt.next();

        lt.next();

        lt.remove();

        lt.previous();

        lt.previous();

        lt.remove();

        System.out.println( xl);

    }
    }
