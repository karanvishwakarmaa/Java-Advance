package abuDip_MCQ_Solutions;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Ques2 {
    public static void main(String[] args) {

        NavigableMap <String,String> testmap = new TreeMap<String,String>();

        testmap.put("a","apple");

        testmap.put("b","ball");

        testmap.put("c","cat");

        testmap.put("aa","myapple");

        testmap.put("bb","myball");

        testmap.put("cc","mycat");

        testmap.pollLastEntry();

        testmap.pollFirstEntry();

        NavigableMap<String,String> tailmap = testmap.tailMap("bb",false);

        System.out.println(tailmap.pollFirstEntry());

        System.out.println(testmap.size());

    }
}
