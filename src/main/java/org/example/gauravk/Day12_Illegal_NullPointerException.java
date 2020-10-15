package org.example.gauravk;

public class Day12_Illegal_NullPointerException {
    public static void main(String[] args)
    {
        add(3,4);

        //Null Pointer exception comes when you pass a null parameter
        // Comment this code to see Illegal pointer exception
        add(null,4);

        //illegal pointer exception
        add(-9,10);

    }
    public static void add(Integer i,Integer j)
    {

        System.out.println(i+j);
        if(i<0)
        {
            // IllegalArgumentException can be thrown by a program if we feel its wrong
            // as per business logic but accepted by JVM
            throw new IllegalArgumentException(" First parameter cannot be less than 0");
        }
    }

}
