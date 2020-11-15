package org.example.akshat;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.TreeSet;

public class Day36_PQExample {
    private static void printArguments(Object obj) {
        System.out.println(obj);
    }
    public static void main(String args[]) {
        HashSet<String> hashSetObj = new HashSet<String>();
        hashSetObj.add("bbb");
        hashSetObj.add("aaa");

        // PQ from HashSet
        PriorityQueue<String> pqObject = new PriorityQueue<>(hashSetObj);
        printArguments(pqObject);

        SortedSet<Integer> ssInt = new TreeSet<>();
        ssInt.add(9);
        ssInt.add(1);
        ssInt.add(6);
        ssInt.add(12);
        ssInt.add(10);
        ssInt.add(20);
        ssInt.add(16);

        //PQ from SS
        PriorityQueue<Integer> pqObjectIntSS = new PriorityQueue<>(ssInt);

        //PQ with Default constructor
        PriorityQueue<Integer> pqObjectInt = new PriorityQueue<>();
        pqObjectInt.add(9);
        pqObjectInt.add(1);
        pqObjectInt.add(6);
        pqObjectInt.add(12);
        pqObjectInt.add(10);
        pqObjectInt.add(20);
        pqObjectInt.add(16);

        System.out.println(pqObjectInt);
        pqObjectInt.poll();
        System.out.println(pqObjectInt);
        pqObjectInt.poll();
        System.out.println(pqObjectInt);
        System.out.println(pqObjectIntSS);

        /**
         * PriorityQueue()
         *         It creates a PriorityQueue with the default initial capacity which is 11;
         *         that orders its elements according to their natural ordering.
         *
         * public PriorityQueue(SortedSet<? extends E> c) constructor -
         *                 It creates a PriorityQueue containing the elements in the specified sorted set.
         *                 This priority queue will be ordered according to
         *                 the same ordering as the given sorted set.
         *
         * public PriorityQueue(Collection<? extends E> c)
         *         It creates a PriorityQueue containing the elements in the specified collection like HashSet.
         *         If the specified collection is an instance of SortedSet or is another PriorityQueue,
         *         this priority queue will be ordered according to the same ordering. Otherwise, this priority queue
         *         will be ordered according to the natural ordering of its elements.
         */


        /**
         * 1. What is binary heap?
         */

    }
}
