package org.example.gauravk;

import java.util.TreeSet;

public class Day_TreeSet_32 {
    public static void main(String[] args)
    {
        TreeSet t1= new TreeSet();
        t1.add("Sachin");
        t1.add("ww.udzial.com");
        t1.add("Sachin");
        t1.add("means Share");
        t1.add("abc");
        t1.add("def");
        t1.add("stu");

        t1.forEach(System.out::println);


        // Below works on integer and string too
        System.out.println("Prints the first value after sort =" +t1.first());
        System.out.println("Prints the last value after sort = "+t1.last());

        System.out.println(t1.descendingSet());


        // below function works only for integer
        TreeSet t2= new TreeSet();
        t2.add(1);
        t2.add(20);
        t2.add(3);
        t2.add(4);
        t2.add(50);
        t2.add(6);


         for(Object in:t2)
         {
             System.out.println(in);
         }

         // Closer or lesser than 2
         System.out.println("Floor for 2 = "+ t2.floor(2));

         // prints numbers upto this valye
         System.out.println("Value upto this number 7 = "+t2.headSet(7));

         System.out.println("Immediate number higher than 5 ="+t2.higher(5));

         System.out.println("Immediate number lower than 30 = "+ t2.lower(30));

    }
}
