package org.example.akshat;

import java.util.ArrayList;
import java.util.Vector;

public class VectorTest {
    public static void main(String args[]) {
//        Vector<Character> v = new Vector<Character>();
//
//
//
//        v.add('a');
//        v.add('b');
//        v.add('z');
//        v.add('d');
//        v.add('e');
//        System.out.println(Collections.max(v));


        Vector<String> v1 = new Vector<>();

        // adding elements to the vector v1
        v1.add("Geeks");
        v1.add("For");
        v1.add("Geeks");
        v1.add("is");
        v1.add("a");
        v1.add("computer");
        v1.add("science");
        v1.add("portal");

        ArrayList<String> v2 = new ArrayList<>();
        v2.add("Geeks");
        v2.add("For");
        v2.add("Geeks");
        v2.add("contains");
        v2.add("well");
        v2.add("written");
        v2.add("programming");
        v2.add("articles");
        v2.add("and");
        v2.add("much");
        v2.add("more.");

        v1.retainAll(v2);

        System.out.println(v1);
    }

}
