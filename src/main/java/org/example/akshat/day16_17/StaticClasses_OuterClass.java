package org.example.akshat.day16_17;

import static org.example.akshat.day16_17.AnotherClassWithStaticClasses.*;
/**
 * 1. Modifier 'static' can't be used here. Throws Complilation error.
 * 2. You cannot use the static keyword with a class unless it is an inner class.
 */
public class StaticClasses_OuterClass {

    int i = 9000;

    public static void main(String[] args) {
        /**
         * The only way to call a non-static method from a static method is to have
         * an instance of the class containing the non-static method.
         *
         * exampleMethodFromInnerClass() is a non-static method in a Inner static class.
         * exampleMethodFromInner_InnerClass()is a non-static method in a nested Inner static class.
         */
        //non-static method in a Inner static class.
        new StaticClasses_OuterClass.Day14_Static_Inner_01().exampleMethodFromInnerClass();
        new Day14_Static_Inner_01().exampleMethodFromInnerClass();

        //non-static method in a nested Inner static class.
        new Day14_Static_Inner_01.Day14_Static_InnerOfInner().exampleMethodFromInner_InnerClass();

        /**
         * exampleStaticMethodFromInnerClass() is a Static method in a Inner static class.
         */
        Day14_Static_Inner_01.exampleStaticMethodFromInnerClass();
        StaticClasses_OuterClass.Day14_Static_Inner_01.exampleStaticMethodFromInnerClass();

        /**
         * exampleStaticMethodFromInner_InnerClass() is a Static method in a nested Inner static class.
         */
        Day14_Static_Inner_01.Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();
        StaticClasses_OuterClass.Day14_Static_Inner_01.Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();

        //Compile time error. Parent of the nested static class Day14_Static_Inner_01 class needs to be imported.
        //Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();

        /**
         * Result of Static Import.
         * Static import helps to access the static members of a class directly without class name or any object.
         */
        InnerStaticClass_010.InnerStaticClass_010_Method();
        InnerStaticClass_020.InnerStaticClass_021.InnerStaticClass_021_Method();
    }

    /**
     * Non-Static method of main class.
     */
    public void exampleMethodFromMainClass() {
        System.out.println("This is a instance method of Outer class StaticClasses_OuterClass.!!");
    }


    /**
     * 1. Only Inner classes can be static and not the main Class.
     * 2. It can be accessed without instantiating the outer class.
     */
    public static class Day14_Static_Inner_01 {

        public void exampleMethodFromInnerClass() {
            System.out.println("Day14_Static_Inner_01");

            System.out.println();

            //A method from main class can be called using the instance of the main class.
            new StaticClasses_OuterClass().exampleMethodFromMainClass();
        }

        public static void exampleStaticMethodFromInnerClass() {
            System.out.println("Static - Day14_Static_Inner_01");

            //Follow conclusion #5.
            System.out.println(new StaticClasses_OuterClass().i);
        }

        /**
         * Inner of Inner classes can be static.
         */
        public static class Day14_Static_InnerOfInner {

            public void exampleMethodFromInner_InnerClass() {
                System.out.println("Day14_Static_InnerOfInner");

                //A method from main class can be called using the instance of the main class.
                new StaticClasses_OuterClass().exampleMethodFromMainClass();
            }

            public static void exampleStaticMethodFromInner_InnerClass() {
                System.out.println("Static : Day14_Static_InnerOfInner!!");
            }
        }
    }

    /**
     * Conclusion:
     * 1. Static methods are used to perform an operation that are independent of class instances.
     * 2. Static methods are widely used to create utility/helper classes so that they can be obtained without creating a new objects.
     * 3. To access/change static variables and other static methods that don't depend upon objects.
     * 4. static methods in Java are resolved at compile time.
     * 5. static methods cannot access instance variables and instance methods directly; they need some object reference to do so
     */

    /**
     * Importance of Static import:
     *  1. Use static import to avoid class reference.
     *  2. Use it only when we are using the static variable of a class multiple times, it’s not good for readability.
     */

}


