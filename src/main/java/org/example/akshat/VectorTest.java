package org.example.akshat;

import java.util.Vector;

public class VectorTest extends Vector<String>{ //AbstractList<E>

    public synchronized void removeRange(int fromIndex, int toIndex) {
        modCount++;

    }

    public static void main(String args[]) {
        VectorTest v = new VectorTest();

        // inserting elements into the vector
        v.add("Geeks");
        v.add("for");
        v.add("Geeks");
        v.add("Ankit");
        v.add("Mishra");
        v.add("MNNIT");

        // printing vector before deleting
        System.out.println("Vector before calling"
                + " removeRange(): " + v);

        // calling removeRange() function

        v.removeRange(1, 3);
        v.subList(1,3).clear();
        v.clear();
        // printing after removeRange() called

        System.out.println("Vector after calling"
                + " removeRange(1, 3): " + v);
    }


//        // initializing a Vector
//        Vector<Character> v = new Vector<>();
//
//        // adding values to the Vector
//        v.add('a');
//        v.add('b');
//        v.add('c');
//        v.add('d');
//        v.add('z');
//
//        // finding the largest element
//        char n = Collections.max(v);
//
//        // printing the largest element
//        System.out.println("The maximum value present in Vector is : " + n);


//        Vector<String> v1 = new Vector<>();
//
//        // adding elements to the vector v1
//        v1.add("Geeks");
//        v1.add("For");
//        v1.add("Geeks");
//        v1.add("is");
//        v1.add("a");
//        v1.add("computer");
//        v1.add("science");
//        v1.add("portal");
//
//        ArrayList<String> v2 = new ArrayList<>();
//        v2.add("Geeks");
//        v2.add("For");
//        v2.add("Geeks");
//        v2.add("contains");
//        v2.add("well");
//        v2.add("written");
//        v2.add("programming");
//        v2.add("articles");
//        v2.add("and");
//        v2.add("much");
//        v2.add("more.");
//
//        v1.retainAll(v2);
//
//        System.out.println(v1);
//    }

}
