package org.example.gauravk;

import java.util.HashSet;
import java.util.Iterator;

public class Day28_HashSet {

    public static void main(String[] args) {
        HashSet h1 = new HashSet();
        h1.add(20);
        h1.add("gaurav");
        h1.add("Udzial");

        // print hashset
        System.out.println(h1);




        //trying another style constructor
        HashSet h2 = new HashSet(20);
        h2.addAll(h1);

        // yet another style hashset constructor
        HashSet h3 = new HashSet(20, 2);
        h3.addAll(h2);
        h3.addAll(h3);


        // print hashset via Iterator
        System.out.println(" Printing via Iterator ");
        for (Iterator e = h1.iterator(); e.hasNext(); ) {
            System.out.println(e.next());
        }

        //Foreach loop
        System.out.println("Printing via for each loop");
        for (Object s : h2) {
            System.out.println(s);
        }

        // Enhanced for each loop
        System.out.println("Enhanced foreach loop ");
        h3.forEach(s -> System.out.println(s));

        // latest java 8.0 version
        System.out.println(" Java 8 version for each loop");
        h3.forEach(System.out::println);

        // remove Element
        h3.remove("gaurav");
        System.out.println(h3);

        // check if element exists in hashset
        System.out.println("Does Element exist " + h1.contains("Udzial"));

        HashSet h4 = new HashSet();
        System.out.println("is H4 empty "+ h4.isEmpty());

        System.out.println("Size of HashSet is "+h4.size());

        h3.clear();
        System.out.println("is H3 empty "+ h3.isEmpty());

        System.out.println("Using clone to copy");
        h4 = (HashSet) h2.clone();
        System.out.println(h4);

    }


}