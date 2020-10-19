package org.example.gauravk;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Day14_Hashset_gk {

    @Test
    class Animal
    {
        int legs;
        String name,type;
        int hands;
        public Animal(int l,String n,String ty, int h)
        {
            this.legs=l;
            this.name=n;
            this.type=ty;
            this.hands=h;
        }
    }
    @Test
    public void hashset()
    {


        // Empty Hashset
        HashSet h1 = new HashSet();
        System.out.println(h1);

        // Add elements to hash
        h1.add("Hare");
        h1.add("krishna");
        h1.add("Hare");
        h1.add("www.udzial.com");
        h1.add("udzial");
        h1.add("means");
        h1.add("share");
        h1.add(null);


        // only unique elements will be stored and printed
        System.out.println(h1);

        // Printing the hash via iterator
        Iterator ie = h1.iterator() ;
        while(ie.hasNext())
        {
            System.out.println(ie.next());

        }

        // Remove an element
        h1.remove("Hare");

        // Remove a specific element based on a condition

        // Empty the set
        h1.clear();
        System.out.println("Now its empty " + h1);

        System.out.println("Printing the list ");
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,2,3));
        System.out.println(al);

        // now converting ArrayList to Hash which will remove the duplicate elements
        HashSet<Integer> h2 = new HashSet(al);
        h2.add(54);
        h2.removeIf(s->(s%2==0));

        for( Integer i :h2)
        {
            System.out.println(i);
        }

        h2.addAll(h1);
        System.out.println(h2);
        // Using the class now for the hashset

        Animal obj = new Animal(4,"Cow","Mammal",4);
        Animal obj2 = new Animal(2,"Beer","Mammal",2);
        Animal obj3 = new Animal(2,"Beer","Mammal",2);


        HashSet<Animal> h3= new HashSet<Animal>();
        h3.add(obj);
        h3.add(obj2);
        h3.add(obj);
        h3.add(obj3);

        //Does not allowed to insert null value for class object level
       // h3.add(null);

        for(Animal a:h3)
        {
            System.out.println("Animal legs = "+a.legs + " Animal Name = "+a.name + " Animal type "+
                    a.type + " Animal hands "+a.hands);
        }

    }



}
