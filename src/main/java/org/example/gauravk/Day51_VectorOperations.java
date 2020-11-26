package org.example.gauravk;

import java.util.Iterator;
import java.util.Vector;

public class Day51_VectorOperations {
    public static void main (String [] args)
    {
        Vector v = new Vector();

        v.add('a');
        v.add('b');
        v.add('y');
        v.add('z');
        v.add('c');

        System.out.println("Vector Data is ");
        System.out.println(v);

        Iterator i= v.iterator();
        char c=(char) v.get(0);
        char smallest=(char) v.get(0);
        char largest=(char) v.get(0);
        for(int j=1;j<v.size();j++)
        {

            c=(char) v.get(j);
            if( c< smallest)
            {
                smallest=c;
            }
            else if (c > largest)
            {
                largest=c;
            }

        }
        System.out.println(" The smallest character is "+ smallest);
        System.out.println("The largest character is "+ largest);

    }
}
