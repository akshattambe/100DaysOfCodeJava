package org.example.gauravk;

import java.util.HashSet;
import java.util.Set;

public class Day30_HashSetOperations {
    public static void main(String[] args)
    {
        Set h1 = new HashSet();

        h1.add("www.udzial.com");
        h1.add("Udzial");
        h1.add("Means");
        h1.add(40);

        Set h2 = new HashSet();

        // Copied All from the hashset
        h2.addAll(h1);

        System.out.println("Cloned from other Hash Set ");
        h2.forEach(System.out::print);

        System.out.println("\n Checking Hash are equal = " + h1.equals(h2));

        h2.removeAll(h2);
        System.out.println("\n Emptying the Hashset ");

        h2.add(40);
        System.out.println("");
        System.out.println("\n Checking if h2 contains all h1 " + h2.containsAll(h1));
        System.out.println("\n Checking if h1 contains all h2 "+ h1.containsAll(h2));

        System.out.println("Printing the hashsets");
        System.out.println(h1);
        System.out.println(h2);

        // just takes the intersection i.e. common elements
        h2.retainAll(h1);
        System.out.println(h2);

        Object[] arr= h1.toArray();

        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        h2.addAll(h1);

        System.out.println("Hashcodes are ");
        System.out.println(h1.hashCode());
        System.out.println(h2.hashCode());

        h2.removeAll(h1);






    }
}
