package org.example.akshat;

import java.util.*;

public class PracticeSet {

    private static void printArguments(Object obj) {
        System.out.println(obj);
    }

    public static void main(String args[]) {
        HashSet<String> hashSetObj = new HashSet<String>();
        TreeSet<Object> treeSetObj = new TreeSet<>();
        LinkedHashSet<Object> linkedHashSetObj = new LinkedHashSet<>();

        hashSetObj.add("bbb");
        hashSetObj.add("aaa");
//        hashSetObj.add(111);
        hashSetObj.add("#¤%");
        hashSetObj.add("#¤%");//NO Duplicates
        hashSetObj.add("ccc");
        hashSetObj.add("null");
//        hashSetObj.add(null);//null is allowed
        hashSetObj.add("zzz");
        hashSetObj.add("jjj");

        PriorityQueue qwe = new PriorityQueue(hashSetObj);
        System.out.println(qwe);



//        hashSetObj.


//
//        HashSet cloned_set = (HashSet) hashSetObj.clone();
//        TreeSet asd = (TreeSet) treeSetObj.clone();
//
//        printArguments(hashSetObj);

        /**
         * Output is:
         * [aaa, null, ccc, bbb, #¤%, null, zzz, jjj, 111]
         *
         * 1. NO Duplicates - Why?
         * 2. Order of insertion is not maintained - Why?
         *      For every element, a hash is generated and the values are stored with respect to the generated hash.
         *      The values are compared and sorted in the ascending order.
         * 3. Null is allowed.
         */


//        treeSetObj.add(null);
    }



}
