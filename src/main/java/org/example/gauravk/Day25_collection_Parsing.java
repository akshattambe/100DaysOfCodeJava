package org.example.gauravk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Day25_collection_Parsing {

    public static void main(String[] args)
    {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        Iterator<Integer> it = li.iterator();
        System.out.println("First way to print Collection in Java ");
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("Second way to print Collection in Java ");
        for(Object elm:li)
        {
            System.out.println(elm);
        }

        System.out.println("Third.one way to print Collection in Java");
        for(int i=0 ; i <li.size();i++)
        {
            System.out.println(li.get(i));
        }
        System.out.println("Third.two way to print Collection in Java");

        for(Iterator<Integer> li2 = li.iterator(); li2.hasNext();)
        {
            System.out.println(li2.next());
        }


        System.out.println("Fourth way to print Collection in Java");
        li.forEach(el->{System.out.println(el);});

        System.out.println("fifth way to print Collection in Java");
        li.forEach(el->System.out.println(el));

        System.out.println("sixth way to print Collection in Java");
        li.forEach(System.out::println);



    }



}
