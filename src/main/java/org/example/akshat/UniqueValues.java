package org.example.akshat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UniqueValues {
    public static void main(String args[]) {
        //Get the email.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter email : ");
        String email = scanner.nextLine();

        //Get the country code.
        System.out.println("Please enter 2 digit country code for telephone like 46 for SE: ");
        int phone = scanner.nextInt() * 100000;
        int fixedNum = 75155;

        //Process email.
        String[] emailArr = email.split("@");

        //Generate random string.
        String suf = String.format("%04d", new Random().nextInt(10000));

        //Prepare Personal details.
        List<Object> li = new ArrayList<>();
        li.add("+" + Integer.toString(phone + fixedNum));
        li.add("Hisingsgatan ");

        //Print unique data.
        System.out.println(emailArr[0] + "+" + suf + "@" + emailArr[1]);
        for(Object e:li){
            System.out.println(e + suf);
        }
    }
}
