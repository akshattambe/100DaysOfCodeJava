package org.example.gauravk;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Day46_linkedList {

    static node head;
    static class node
    {
      String data;
      node next;

      node(String st)
      {
          data=st;
          next=null;
      }
    }

    public static void main(String[] args)
    {
        // Constructor1
        LinkedList<String> ll= new LinkedList<String>();

        ll.add("Jai");
        ll.add("Shri");
        ll.add("Krishna");
        ll.add("HAri");
        ll.add("Bol");


        // Constructor 2
        LinkedList ll2= new LinkedList(ll);

        System.out.println("Elements in the second list are as below ");
        System.out.println(ll2);

        System.out.println("Size of linkedlist is "+ ll2.size());

 
       /*  while(it.hasNext())
         {
             System.out.println("half "+ half + " counter = "+ c);
             if(c==half)
             {
                 System.out.println("The middle elements is "+ it.next());
             }
             c++;
         }

   */




    }

    // Reverse a link list
    public static node reverse(node n)
    {
        node prev=null;
        node curr=n;
        node next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        n=prev;
        return n;

    }
}
