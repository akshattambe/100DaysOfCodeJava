package org.example.gauravk;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Day38_PriorityQueue {

    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(150);
        pq.add(50);
        pq.add(200);
        pq.add(250);

        // can only add comparable objects. so if integers added string are not allowed
        // pq.add("gk");
          System.out.println("Poll "  + pq.poll());
          System.out.println("Peek does not move pointer" + pq.peek());
          System.out.println("Peek does not move pointer "+ pq.peek());
          System.out.println("Poll moves counter after print "+ pq.poll());

          System.out.println("offer = addition either will happen or boolean but no exception " + pq.offer(20));
          System.out.println("Comparator "+ pq.comparator());


           Object[] arr=pq.toArray();
           System.out.println("Type is " + arr.getClass());
           System.out.println("Type is " + pq.getClass());


        // Various Ways to print PQ
        System.out.println("Printing with For loop ");
        for (Object o : pq) {
            System.out.println(o);
        }

        System.out.println("Printing via Iterator");
        Iterator pqit=pq.iterator();
        while(pqit.hasNext())
        {
            System.out.println(pqit.next());
        }

        //pq.foreach(System.out::println);
    }
}
