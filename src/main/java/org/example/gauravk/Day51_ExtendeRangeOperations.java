package org.example.gauravk;

import java.util.Vector;

public class Day51_ExtendeRangeOperations extends Vector {

    public static void main(String[] rag)
    {
        Day51_ExtendeRangeOperations obj = new Day51_ExtendeRangeOperations();
        obj.add("test");
        obj.add("Vector");
        obj.add("range");

        System.out.println(" Before removal from range "+ obj);
        obj.removeRange(1,2);
        System.out.println(" After Removal from range  "+ obj);
       
    }
}
