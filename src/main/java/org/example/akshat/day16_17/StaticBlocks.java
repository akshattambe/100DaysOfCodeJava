package org.example.akshat.day16_17;

import java.util.LinkedList;
import java.util.List;

public class StaticBlocks {

    public static void main(String[] args){
        System.out.println(friends);
    }

    public static List<String> friends = new LinkedList<>();

    static {
        friends.add("Tommy");
        friends.add("Tiger");
        friends.add("Captain");
    }

    static {
        friends.add("Jack");
        friends.add("Daniel");
    }

    /**
     * Compelling Reasons to Use static Blocks
     * 1. If initialization of static variables requires some additional logic.
     * 2. If the initialization of static variables is error-prone and requires exception handling.
     */

    /**
     * 1. A class can have multiple static blocks.
     * 2. static fields and static blocks are resolved and executed in the same order as they are present in the class.
     */
}
