package org.example.sarojini;

import static org.example.sarojini.Day20_Class1.*;
/*
Can not access private variables or methods or classes from the next class
Only one class allowed as static nested class
 */

public class Day20_Class2 {
    public static void main(String[] args) {
        Day20_Class1 o = new Day20_Class1();
        System.out.println(s3);
        o.method1();
        method2();
        inner_class1.method4();
        System.out.println(o.s1);//Access public member of another class
        System.out.println(o.s4);
        }
}
