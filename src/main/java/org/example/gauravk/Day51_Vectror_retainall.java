package org.example.gauravk;

import java.util.ArrayList;
import java.util.Vector;

public class Day51_Vectror_retainall {

    public static void main(String[] srag)
    {
        Vector v = new Vector();

        v.add('a');
        v.add('d');
        v.add('y');
        v.add('z');
        v.add('c');



        Vector v2= new Vector(16);
        v2.add('z');
        v2.add('d');
        v2.add('t');

        System.out.println(v2);
        boolean value=v2.retainAll(v);
        System.out.println("Retains all retrun a true if vector has changed because of this operation. so in current case = "+value);
        System.out.println(v2);


        System.out.println("Retain keeps only those elements in current which are present in other one  - Intersection ");
        System.out.println(v2);

        ArrayList l1 = new ArrayList<>();
        l1.add('h');
        l1.add('g');
        l1.add('d');
        l1.add(40);



        v2.retainAll(l1);
        System.out.println("Retainall work across different collections");
        System.out.println(v2);

        System.out.println(l1);
       //v2.removeRange
        System.out.println();


        System.out.println(v.capacity());
        System.out.println(v2.capacity());

        v.ensureCapacity(12);
        v2.ensureCapacity(24);

        System.out.println(v.capacity());
        System.out.println(v2.capacity());



    }


}

