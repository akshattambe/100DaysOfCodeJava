package org.example.gauravk;

import org.checkerframework.checker.units.qual.A;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Day_57_NextGreatest {

    public static void main(String[] a)
    {
        //ArrayList al = new ArrayList(new Array(4,5,2,25));
        Integer[] ar= {4,7,6,12};
        //System.out.println(ar);

        Stack<Integer> st = new Stack<Integer>();

        for(int i=0;i<ar.length;i++)
        {
            Day55_Stack_operations.push(st,ar[i]);
        }

          System.out.println("Printing Stack ");
          Day55_Stack_operations.printStack(st);

//        theNextHighest(st,12);
//        theNextHighest(st,4);
//        theNextHighest(st,7);
//        theNextHighest(st,6);

        theNextHighestUsingStack(st,12);
        theNextHighestUsingStack(st,4);
        theNextHighestUsingStack(st,7);
        theNextHighestUsingStack(st,6);




    }
    public static void theNextHighest(Stack<Integer> ar, int num)
    {
        Iterator it = ar.iterator();
        Integer theNextHighest=ar.peek();
        Integer nextelement=ar.peek();;
        int c=0;
        while(it.hasNext())
        {
            nextelement=(Integer)it.next();
            //System.out.println(nextelement);
            if(nextelement>num && c==0)
            {
                theNextHighest=nextelement;
                c++;
            }
            else if(nextelement<theNextHighest && nextelement > num )
            {
                theNextHighest=nextelement;
            }
        }
          if(theNextHighest!=num) {
              System.out.println("The next highest element is " + theNextHighest+ " for element = "+ num);
          }
          else
          {
              System.out.println("There is no next highest element available for "+ num);
          }
    }

    public static void theNextHighestUsingStack(Stack<Integer> ar, int num)
    {

        System.out.println("Calculating the Next Highest element for " + num );
        Stack newSt = new Stack();


        Iterator it = ar.iterator();
        Integer element;

           while(it.hasNext())
           {
               element=(Integer) it.next();

              //Checking the element is greater than our number then push it in new array
              if(element>num && newSt.empty())
              {
                 newSt.push(element);

              }
              // checking if new element is greater than our num ber
              else if (element > num && (Integer)newSt.peek() > element )
              {
                  newSt.pop();
                  newSt.push(element);
              }
           }
        if(!newSt.empty()) {
              System.out.println("The element which is next highest to " + num + " is = " + newSt.pop());
          }
          else
          {
              System.out.println("The element which is next highest is not in this stack " );
          }
    }

}
