package org.example.gauravk;

import org.testng.annotations.Test;
import org.testng.collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class Day70_HashMap {

    @Test
    public void createHashMap()
    {
       Map m1 = new HashMap<>();

       // Create
        m1.put(1,"30");
        m1.put(2,"40");
        m1.put(3,"50");
        m1.put(4,"60");
        m1.put(5,5);
        System.out.println(m1);

        // Read
        System.out.println(m1.get(2));

        // Update
        m1.put(3,"1515");
        System.out.println(m1);

        // Delete
        m1.remove(3);
        System.out.println(m1);


    }

    @Test
    public void createHashMapSecond()
    {
        Map m1 = new HashMap<>();

        Map<String,String> m21 = new HashMap<>();

        m21.put("Gaurav","30");
        m21.put("PRateek","40");
        m21.put("Ace","50");
        m21.put("Garvit","60");

      //  m21.put(30,30);
        System.out.println(m21);
    }

    @Test
    public void createHashMapSecond_Extended()
    {
        Map<String,String> m22 = new HashMap<String,String>();

        m22.put("Gaurav","30");
        m22.put("PRateek","40");
        m22.put("Ace","50");
        m22.put("Garvit","60");
    }

    @Test
    public void createHashMapThird()
    {
        Map<String,Integer> m3 = Maps.newHashMap();

        m3.put("Gaurav",30);
        m3.put("PRateek",40);
        m3.put("Ace",50);
        m3.put("Garvit",60);
    }

}
