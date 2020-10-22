package org.example.sarojini;
//create nested static classes
public class Day17_static {
    //add couple of static and non static functions
        String name;
        String empid;
       private static int count=1;
        //static inner class
    static class Eligible_Leave_Inner {
        static int el = 12;
        static int ml = 20;
        static int cl = 10;

        //static method
        void display() {
            //System.out.println(name);static nested class can not access non static variable
            //System.out.println(empid);static nested class can not access non static variable
            System.out.println(count);
            System.out.println(el);//static nested class can access only static members of outer class
            System.out.println(cl);//static nested class can access only static members of outer class
            System.out.println(ml);//static nested class can access only static members of outer class
        }

    }

    //call the above from main method
    public static void main(String[] args) {
        new Day17_static.Eligible_Leave_Inner().display();

    }

}
