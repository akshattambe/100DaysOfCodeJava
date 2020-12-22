package org.example.gauravk;

import org.testng.annotations.Test;

import java.util.HashMap;

public class Day66_HashMap {

    @Test
    public void hashmap()
    {
        // Primitive types not allowed
        //HAshMap<int,char> capCities = new HashMap<int,char>();
        HashMap<Integer,String> capCities = new HashMap<Integer,String>();
        int counter=0;
        capCities.put(counter,"Sunday");
        capCities.put(counter+1,"Monday");
        capCities.put(counter+1,"Tuesday");

        System.out.println(capCities);




    }
}
