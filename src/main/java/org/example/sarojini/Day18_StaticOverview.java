package org.example.sarojini;

/*
1.How does initialization of static members takes place in JVM
interesting and gripping reason using the Static
 */
public class Day18_StaticOverview {
    /*
    1.Static data or members means which is common for all or sharable for everyone.
    2.For static data/members memory will be provided by JVM by default.
    3.Static data classified in 3 types 1.Static variables 2.static methods 3.static blocks.static nested methods not included)
    4.When we run Day18_StaticOverview jvm loads classfile from secondary memory to primary memory.While loading
    all static data or loaded and initialized by JVM only once as class load only one time.
    5.For static variable /class level variable JVM provides memory and filled with default value with the help of preparer.(int=0,boolean=false,reference varible=null)
    6.For Static blocks JVM reads block heading and placed in memory.JVM executes static block directly
    7.For static methods ,JVM reads the method heading and placed in to memory.
    8.Access static variables and static methods by using the class name.
    9.static keyword not applicable or we should not use for outer classes and local variables
    10.Static variables belongs to class ,not object
    */

    static String variable = "Static Variable";

    static void m1() {
        System.out.println("m1 is a static method");
    }

    static {
        System.out.println("this is a static block");
    }

    static class inner {
        //System.out.println(variable);an not access outerclass variable directly//
        // System.out.println(Day18_StaticOverview.variable);
        int a = 10;
        static int b = 10;

    }


    public static void main(String[] args) {
        System.out.println(variable);//accessing variable directly
        Day18_StaticOverview.m1();//accessing method by classname
        System.out.println(Day18_StaticOverview.variable);//accessing variable by classname and prints static variable
        new Day18_StaticOverview.inner();
        System.out.println(inner.b);
        //System.out.println(inner.a);//can not access non static variable in static method
    }
}
