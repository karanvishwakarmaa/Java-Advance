package abuDip_MCQ_Solutions;

import java.util.Set;
import java.util.TreeSet;

public class Ques_79 {
    public static void main(String[] args) {

        boolean bool [] = new boolean[5];

        Set s = new TreeSet();

        bool[0] = s.add(10);

        bool[1] = s.add(new Integer(22));

        bool[2] = s.add("b");

        bool[3] = s.add("a");

        for(int i = 0; i<bool.length;i++)

            System.out.print(bool[i] + " ");

    }
}
