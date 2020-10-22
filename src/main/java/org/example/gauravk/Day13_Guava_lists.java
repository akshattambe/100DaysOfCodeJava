package org.example.gauravk;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class Day13_Guava_lists {
    @Test
    public void guava()
    {

        // Lists to easily assign a list
        List<String> l1 = Lists.newArrayList("1","2","3","4","gaurav","khurana","null","udzial","1","gaurav");

        // reverse a string in the list easily

        List<String> reversed = Lists.reverse(l1);
        System.out.println(reversed);

        // Generate a list from a string
        String str="Www.udzial.com";
        List<Character> lic = Lists.charactersOf(str);
        System.out.println(lic);

        //partition a list
        List<List<String>> par = Lists.partition(l1,2);
        System.out.println(par);

        // Remove duplicates from the list without any null
        List<String> li3= ImmutableSet.copyOf(l1).asList();
        System.out.println(li3);

        // remove Nulls from the list
        List<String> li2=Lists.newArrayList("1","www.","udzial",".com",null, "www");
        Iterables.removeIf(li2, Predicates.isNull());
        System.out.println(li2);
    }

}
