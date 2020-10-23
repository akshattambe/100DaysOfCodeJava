package org.example.sarojini;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
/*
Can not access private variables or methods or classes from the next class
Only one class allowed as static nested class
 */
public class Day20_Class1 {
    public String s1 = "This is a public Variable in outer class";
    private String s2 = " This is a private variable in Outer class";
    static String s3 = "This is a static variable in Outer class";
    String s4 = "this is a Non-static variable in outer class";

    public void method1() {
        System.out.println("This is my first outer class non static method");
        inner_class1.method4();
        System.out.println(s2);

    }

    public static void method2() {
        System.out.println("This is my first outer class with public static method");

    }

    private static void method3() {
        System.out.println("This is my first outer class with private static method");
    }

    static {
        System.out.println("This is a static block");
        String s5 = "This is a Static block variable";
        System.out.println(s5);
    }

    public static class inner_class1 {
        static void method4() {
            String s6 = "this is my inner public static class variable";
            System.out.println("This is my public static inner class");
            System.out.println(s6);
        }

        public static class inner_class2 {
            static void method5() {
                String s7 = "this is my inner private static class variable";
                System.out.println("This is my private static inner class");
                System.out.println(s7);
            }
        }
    }
}


