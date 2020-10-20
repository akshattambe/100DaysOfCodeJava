package org.example.akshat.day16_17;

public class AnotherClassWithStaticClasses {
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
                System.out.println("Static : InnerStaticClass_021_Method !!");
            }
        }
    }
}
