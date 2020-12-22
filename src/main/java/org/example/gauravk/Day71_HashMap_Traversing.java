package org.example.gauravk;

import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.util.*;

public class Day71_HashMap_Traversing {

    @Test
    public void createHashMap()
    {
       HashMap<Integer,String> m1 = new HashMap<Integer, String>();

       // Create
        m1.put(1,"30");
        m1.put(2,"40");
        m1.put(3,"50");
        m1.put(4,"60");
        System.out.println(m1);

        // Read
        System.out.println(m1.get(2));

        // Update
        m1.put(3,"1515");
        System.out.println(m1);

        // Delete
        m1.remove(3);
        System.out.println(m1);

        Iterator i1=m1.entrySet().iterator();

        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }

        // Print Key Values both
        for(Map.Entry<Integer,String> entry: m1.entrySet())
        {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

        // Java 8
        m1.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() +  " " + entry.getValue());
        });

        // Get all keys
        System.out.println("All keys of hashmap");
        Set<Integer> s= m1.keySet();
        for(Integer a:s)
        {
            System.out.println(a);
        }
        // Get all Values
        System.out.println("All VAlues  of hashmap");

        Collection<String> sVal = m1.values();
        for(String sV:sVal)
        {
            System.out.println(sV);
        }

    }


}
