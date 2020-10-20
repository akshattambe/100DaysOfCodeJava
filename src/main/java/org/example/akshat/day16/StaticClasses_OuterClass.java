package org.example.akshat.day16;

/**
 * 1. Modifier 'static' can't be used here. Throws Complilation error.
 * 2. You cannot use the static keyword with a class unless it is an inner class.
 */
public class StaticClasses_OuterClass {

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

            //A method from main class can be called using the instance of the main class.
            new StaticClasses_OuterClass().exampleMethodFromMainClass();
        }

        public static void exampleStaticMethodFromInnerClass() {
            System.out.println("Static - Day14_Static_Inner_01");

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


}


