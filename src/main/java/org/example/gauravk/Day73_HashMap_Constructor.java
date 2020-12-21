package org.example.gauravk;

import org.testng.annotations.Test;

import java.util.*;

public class Day73_HashMap_Constructor {
    @Test
    public void hashConstructor()
    {
        // Constructor 1
        Map<String,String> hm1 = new HashMap<String,String>();

        // Constructor 2
        Map<Integer,String> hm2 = new HashMap<>(1);
        hm2.put(100,"Hare");
        hm2.put(20,"Krishna");
        System.out.println("Size is 2 = "  + hm2.size());

        // Constructor 3
        Map<String,String> hm3 = new HashMap<>(2,2);

        // Constructor 4
        Map<String,String> hm4 = new HashMap<>(hm3);

        System.out.println(hm2);
        // Update old value with a new one for a key in Hashmap
        hm2.replace(20,"Ram");
        System.out.println(hm2);

        hm2.replace(20,hm2.get(20));

        hm2.put(90,"Hare");
        hm2.put(60,"Krishna");
        sortHashMap_keys(hm2);
        sortHashMap_keys_putallMethod(hm2);

        sortMap_values(hm2);

        sortMap_keys(hm2);

    }


    public void sortHashMap_keys(Map hm)
    {
        Map<Integer,String> m = new TreeMap(hm);

        for(Map.Entry<Integer,String> h : m.entrySet())
        {
            System.out.println(h.getKey());
        }
    }

    public void sortHashMap_keys_putallMethod(Map hm)
    {
        Map<Integer,String> m = new TreeMap();
        m.putAll(hm);

        for(Map.Entry<Integer,String> h : m.entrySet())
        {
            System.out.println(h.getKey());
        }
    }

    public void sortMap_values(Map m)
    {
        System.out.println("Sorted by Values");
        m.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
    public void sortMap_keys (Map m)
    {
        System.out.println("Sorted by Keys ");
        m.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }
}
