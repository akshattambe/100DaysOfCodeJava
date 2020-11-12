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

        PriorityQueue<String> pqObject = new PriorityQueue<>(hashSetObj);
//        printArguments(pqObject);

        SortedSet<Integer> ssInt = new TreeSet<>();
        ssInt.add(9);
        ssInt.add(1);
        ssInt.add(6);
        ssInt.add(12);
        ssInt.add(10);
        ssInt.add(20);
        ssInt.add(16);

        PriorityQueue<Integer> pqObjectIntSS = new PriorityQueue<>(ssInt);
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



    }
}
