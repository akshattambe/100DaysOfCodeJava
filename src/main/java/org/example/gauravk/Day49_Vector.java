package org.example.gauravk;

import java.util.Iterator;
import java.util.Vector;

public class Day49_Vector {


    public static void main(String args[])
    {
        Vector v= new Vector<>();

        v.add(40);
        v.add("Hello");
        v.add("HAre Krishna");
        v.add("Jai Shri Krishna");
        v.add("www.udzial.com");

        System.out.println(v);

        System.out.println("Add at a particular position");
        v.add(2,"I am third position");
        System.out.println(v);

        System.out.println("replace a particular position ");
        v.set(3,"SharingisCaring");

        System.out.println("remove via index ");
        v.remove(5);
        System.out.println(v);

        System.out.println("remove via value");
        v.remove("Hello");
        System.out.println(v);


        System.out.println("Three methods of Iteration ");
        Iterator it = v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        for(Object o:v)
        {
            System.out.println(o);
        }

        v.forEach(n -> {System.out.println(n);});
    }
}
