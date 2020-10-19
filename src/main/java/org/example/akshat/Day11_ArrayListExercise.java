package org.example.akshat;

import com.google.common.collect.Lists;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Day11_ArrayListExercise {

    public static void main(String[] args){
        new Day11_ArrayListExercise().RemovingDuplicatesWithJava();
    }

    /**
     * Remove duplicate entries from an List in java.
     * 1. Using HashSet
     */
    public void RemovingDuplicatesWithJava() {
        List<Integer> listWithDuplicates = Lists.newArrayList(0, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = new ArrayList<>(
                new HashSet<>(listWithDuplicates)); //List can be passed as an argument to HashSet and vice-versa

        Assert.assertTrue(listWithoutDuplicates.size() == 4);

        //Original list remain unchanged.
        System.out.println(listWithDuplicates.toString());

        System.out.println(listWithoutDuplicates.toString());
    }

}
