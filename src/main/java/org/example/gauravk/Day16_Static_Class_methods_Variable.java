package org.example.gauravk;

public class Day16_Static_Class_methods_Variable {


    public static class iamStaticClass
    {
        int nonStatic;
        static int staticVariable;
        public void nonstaticIam()
        {
            System.out.println(" I am a nonstatic method in a static class, you can call me via object only even though i am part of a static class");
        }

        public static void staticIam() {

            System.out.println(" I am a static method in static class. So use my class name to access me ");
             System.out.println(" Hey you know Static method inside nested class can access outer class static methods as well"+iamstatic);
        }
    }
    int nonstatic;
    static int iamstatic;
    static
    {
        System.out.println("Static method 1. It will be called first ");
    }
    static
    {
        System.out.println("Static method 2 , since static follow FCFS ");
    }

    public static void staticMethod()
    {
      System.out.println(" I am static method, you can call me by my name from other methods");
      System.out.println(" I can even call other static methods ");
      staticMethodSecond();

      System.out.println(" You cannot call anything nonstatic method from me. i am static. But you can call me");
      Day16_Static_Class_methods_Variable obj2= new Day16_Static_Class_methods_Variable();
      obj2.nonStaticMethodSecond();


      System.out.println(" I can access only static variable only"+iamstatic);
      //System.out.println(" I cant access non static variable only"+nonstatic);
    }

    public static void staticMethodSecond()
    {
        System.out.println("I am the second tatic method. i Can only be called by any methods(static or non static) ");
        System.out.println("But you know i cant call non-static directly, i need class objects for them");

    }


    public void nonStaticMethod()
    {
       System.out.println(" But do you know fellow non-static members can call me directly. i am nonstatic");
    }
    public void nonStaticMethodSecond()
    {
        System.out.println(" Create objects and access nonstatic methods if you want to call us(nonstatic from static) ");
        nonStaticMethod();
    }



    public static void main(String[] args)
    {
        // Static variable
        System.out.println(" I am static variable and i get the default value, since you did not assigned me "+ iamstatic);

        //Static - Method
        System.out.println(" You can access me directly as i am static. Be it variable or method " );
        staticMethod();

        // Non Static - Instance variable
        //System.out.println(" You need not to use object for me "+nonstatic);

        // Non Static - instance  methods
        Day16_Static_Class_methods_Variable obj = new Day16_Static_Class_methods_Variable();
        System.out.println(" Now you are accessing me the way you should using an object "+ obj.nonstatic);

        // Static Class
        System.out.println(" You can create objects for a static class to access nonstatic variables and methods");
        iamStaticClass objStat = new iamStaticClass();

        System.out.println("Variable from a static class"+ objStat.nonStatic);
        objStat.nonstaticIam();

        System.out.println("For accessing a static class or static variable, use class name "+iamStaticClass.staticVariable);
        iamStaticClass.staticIam();



    }
}
