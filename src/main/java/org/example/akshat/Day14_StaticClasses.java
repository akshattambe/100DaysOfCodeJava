package org.example.akshat;

/**
 * 1. Modifier 'static' can't be used here. Throws Complilation error.
 * 2. You cannot use the static keyword with a class unless it is an inner class.
 */
public class Day14_StaticClasses {

    public static void main(String[] args) {
        /**
         * The only way to call a non-static method from a static method is to have
         * an instance of the class containing the non-static method.
         *
         * exampleMethodFromInnerClass() is a non-static method in a Inner static class.
         * exampleMethodFromInner_InnerClass()is a non-static method in a nested Inner static class.
         */
        //non-static method in a Inner static class.
        new Day14_StaticClasses.Day14_Static_Inner().exampleMethodFromInnerClass();
        new Day14_Static_Inner().exampleMethodFromInnerClass();

        //non-static method in a nested Inner static class.
        new Day14_Static_Inner.Day14_Static_InnerOfInner().exampleMethodFromInner_InnerClass();

        /**
         * exampleStaticMethodFromInnerClass() is a Static method in a Inner static class.
         */
        Day14_Static_Inner.exampleStaticMethodFromInnerClass();
        Day14_StaticClasses.Day14_Static_Inner.exampleStaticMethodFromInnerClass();

        /**
         * exampleStaticMethodFromInner_InnerClass() is a Static method in a nested Inner static class.
         */
        Day14_Static_Inner.Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();
        Day14_StaticClasses.Day14_Static_Inner.Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();

        //Compile time error. Parent of the nested static class Day14_Static_Inner class needs to be imported.
        //Day14_Static_InnerOfInner.exampleStaticMethodFromInner_InnerClass();

    }

    /**
     * Non-Static method of main class.
     */
    public void exampleMethodFromMainClass() {
        System.out.println("This is a instance method of Outer class Day14_StaticClasses.!!");
    }


    /**
     * 1. Only Inner classes can be static and not the main Class.
     * 2. It can be accessed without instantiating the outer class.
     */
    public static class Day14_Static_Inner {

        public void exampleMethodFromInnerClass() {
            System.out.println("Day14_Static_Inner");

            //A method from main class can be called using the instance of the main class.
            new Day14_StaticClasses().exampleMethodFromMainClass();
        }

        public static void exampleStaticMethodFromInnerClass() {
            System.out.println("Static - Day14_Static_Inner");

        }

        /**
         * Inner of Inner classes can be static.
         */
        public static class Day14_Static_InnerOfInner {

            public void exampleMethodFromInner_InnerClass() {
                System.out.println("Day14_Static_InnerOfInner");

                //A method from main class can be called using the instance of the main class.
                new Day14_StaticClasses().exampleMethodFromMainClass();
            }

            public static void exampleStaticMethodFromInner_InnerClass() {
                System.out.println("Static : Day14_Static_InnerOfInner!!");

            }
        }

    }


}


