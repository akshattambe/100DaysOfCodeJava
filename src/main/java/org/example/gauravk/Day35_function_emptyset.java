package org.example.gauravk;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Day35_function_emptyset {
    public static void main(String [] args)
    {
        HashSet e = new HashSet();
        e.add("Hare");
        e.add(16);
        System.out.println(e);

        Set<Object> f = Collections.emptySet();
        f.add("Krishna");
        System.out.println(f);

    }
}
