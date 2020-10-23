package org.example.gauravk;

public class relatedToTimeCalculation {

    public static void main(String[] args)
    {
        long longwithL= 1*60*24*365*1000L;
        long longwithoutL=1*60*24*365*1000;
        System.out.println(longwithL);
        System.out.println(longwithoutL);

        // long can hold upto 2147483647. anything beyond we have to use suffix
        // Stores whole numbers from -2,147,483,648 to 2,147,483,647

        long longwithL1= 60*60*24*365*1000L;
        long longwithoutL2=60*60*24*365*1000;
        System.out.println(longwithL1);
        System.out.println(longwithoutL2);
    }
}
