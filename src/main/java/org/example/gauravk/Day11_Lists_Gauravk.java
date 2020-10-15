package org.example.gauravk;

import java.util.*;

public class Day11_Lists_Gauravk {

    // function to take few elements from a list using an inbuilt function
    public static <T>void sublist(ArrayList<T> li, int begin, int end)
    {
        // added 1 to end since its not included in subList

        System.out.println("Here is the sublist \n"+ li.subList(begin, end+1));
    }

    // function to remove the duplicates in a list using another list
    public static <T> void removeDuplicates(ArrayList<T> li)
    {
        ArrayList<Integer> li2 = new ArrayList<Integer>();

        for(int i=0; i<li.size(); i++)
        {
            if(!li2.contains(li.get(i)))
            {
                li2.add((Integer) li.get(i));
            }
        }

        System.out.println("After removing the duplicates, here is the list \n"+li2);
    }

    public static <T> void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> li1 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,3,10));

        System.out.println("Original list \n"+ li1);

        sublist(li1,2,4);

        removeDuplicates(li1);


    }
}
