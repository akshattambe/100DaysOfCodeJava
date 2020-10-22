package org.example.akshat.day16_17;

/**
 * Programming specification in Java doesn't allow to declare the top-level class as static;
 * only classes within the classes (nested classes) can be made as static
 */
public class AnotherClassWithStaticClasses {

    int i = 5000;

    private static final int k = 7000;

    public void testMethod(){
        System.out.println("This is from outer calls");
    }

    /**
     * Static class InnerStaticClass_010
     */
    static class InnerStaticClass_010{

        //This is a Static method.
        public static void InnerStaticClass_010_Method(){
            System.out.println("Static : InnerStaticClass_010_Method !!");
        }
    }

    /**
     * Static class InnerStaticClass_020
     */
    static class InnerStaticClass_020{
        static int j = 6000;

        /**
         * This one is not a Static method and hence can be called from a different class
         * using the "static import".
         */
        public void InnerStaticClass_020_Method(){
            System.out.println("Static : InnerStaticClass_020_Method !!");
        }

        /**
         * Static class InnerStaticClass_021
         */
        static  class InnerStaticClass_021{

            /**
             * Static method can be called in different class without the Class name or Object of this class
             * using the "static import".
             */
            public static void InnerStaticClass_021_Method(){

                //static nested classes can only access them through an object's reference
                System.out.println("Static : InnerStaticClass_021_Method !!" + new AnotherClassWithStaticClasses().i);

                //Variable j is the static member of the enclosing/Outer class InnerStaticClass_020
                System.out.println("Static : InnerStaticClass_021_Method !!" + j);

                //Private Variable k is the static member of the enclosing/Outer class AnotherClassWithStaticClasses
                System.out.println("Static : InnerStaticClass_021_Method !!" + k);
            }
        }
    }

    /**
     * IMP notes:
     * The nested class architecture is divided into two groups:
     * 1. Nested classes that are declared static are called Static Nested classes
     *      1.1 Static nested classes only have access to static members of the enclosing class.
     * 2. Nested classes that are non-static are called Inner classes
     *      2.1  Inner classes have access to all member of the enclosing class
     *
     * Insight:    If static nested classes behaved exactly like any other top-level class but
     *          enclosed in the only class which will access it, to provide better packaging convenience.
     */
}
