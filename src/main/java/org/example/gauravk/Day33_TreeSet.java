package org.example.gauravk;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;

public class Day33_TreeSet {
    public static void main(String[] arghs)
    {
        TreeSet t1=new TreeSet();

        t1.add(100);
        t1.add(442);
        t1.add(23);
        t1.add(34);
        t1.add(995);

       // 6th element
        t1.add(46);

        t1.add(176);
        t1.add(585);
        t1.add(49);
        t1.add(10);

     //   TreeSet does not allow null
     //   t1.add(null);

        // TreeSet does not allow heterogeneous elements
       // t1.add("Hare Krishna");

        TreeSet t2= new TreeSet();
        t2.add("HAre");
        t2.add("Krishna");

        System.out.println(t1);
        System.out.println(t2);
        //t2.add(34);

       int i =new ArrayList<>(t1).indexOf(46);
       System.out.println("Index of 6th element '46' is "+ i);

    }
}
