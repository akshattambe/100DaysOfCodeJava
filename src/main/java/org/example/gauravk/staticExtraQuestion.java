package org.example.gauravk;
import java.util.Scanner;
import java.lang.Math;
class staticExtraQuestion
{
    public void staticExtraQuestion() throws CloneNotSupportedException {
        System.out.println(this.clone());

        // java: non-static variable super cannot be referenced from a static context
        System.out.println(super.clone());

    }
    public static void main(String[] args)
    {

        staticExtraQuestion obj = new staticExtraQuestion();
        // java: non-static variable this cannot be referenced from a static context
      //  System.out.println(this.clone());

        // java: non-static variable super cannot be referenced from a static context
      // System.out.println(super.clone());

    }
    static class iAmInAnotherClass
    {
      static int number=10;
    }

}