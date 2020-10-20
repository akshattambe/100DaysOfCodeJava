package org.example.akshat.day16_17;

public class StaticFields {

    /**
     * Reasons to Use static Fields:
     * When the value of variable is independent of objects
     * When the value is supposed to be shared across all objects
     */

    static int VARIABLE_1;
    public static void main(String[] args){

        //We can access static fields using an object reference like below.
        //Nothing wrong practically because compiler does not object!!
        System.out.println(new StaticFields().VARIABLE_1);

        /**
         * IMP: Refrain from using static Fields with an instance variable; instead,
         * Always refer to static variables using class name
         *
         * Reason: It becomes difficult to figure whether it’s an instance variable or a class variable
         */
        System.out.println(StaticFields.VARIABLE_1);
    }

    /**
     * Important:
     * 1. The static variable gets memory only once in the class area at the time of class loading.
     * 2. Static fields and methods are NOT thread safe in Java
     */

}
