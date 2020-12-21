package org.example.gauravk;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;


public class Day72_HashMap_Continue {

@Test
        public void hashmap_null() {
        Map<String, Character> hm = new HashMap<String, Character>();
        hm.put(null, 'a');
        hm.put(null,'b');
        hm.put(null,'c');

        System.out.println("Get the value of null key " +hm.get(null) );
        System.out.println("Size of the hashmap is " + hm.size() );

       boolean b = hm.containsKey(3);
/* trying to produce the NullPointerException error

   if( hm.get(null))
   {
    }
    */
            System.out.println("Get value of key  " + hm.get(3));
            System.out.println("Get value of key  " + hm.containsKey(3));

    for(Map.Entry<String,Character> m:hm.entrySet())
    {
        System.out.println("Key = "+ m.getKey());
        System.out.println("Value = "+ m.getValue());

    }

}


}
