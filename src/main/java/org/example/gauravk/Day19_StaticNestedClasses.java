package org.example.gauravk;
import static org.example.gauravk.staticExtraQuestion.*;
public class Day19_StaticNestedClasses {

    int statOuter;
    static int nonStatOuter;
    public static class statNested1
    {
        int nonstatinner1;
        static int statinner1;

        public static void statInner1()
        {
            System.out.println(nonStatOuter);
            System.out.println(statinner1);


           // System.out.println(statinner2);
            System.out.println(statNested2.statinner2);
        }
        public static class statNested2
        {
            int nonstatinner2;
            static int statinner2;
            public static void statInner1()
            {
                // Inner static classes can access outer static without any class name
                System.out.println(nonStatOuter);
                System.out.println(statinner1);
                System.out.println(statinner2);
            }

        }

    }

public static void main(String[] args)
{
    System.out.println(nonStatOuter);

    // We need to use class name for inner nested static classes.
   // System.out.println(statinner1);
    System.out.println(statNested1.statinner1);

    //System.out.println(nonStatinner2);
    System.out.println(statNested1.statNested2.statinner2);

    // if you would like to access non static members
    System.out.println(new statNested1().nonstatinner1);
    System.out.println(new Day19_StaticNestedClasses.statNested1().nonstatinner1);

    // With static import you can directly use function name
    System.out.println(staticExtraQuestion.iAmInAnotherClass.number);
    System.out.println(iAmInAnotherClass.number);

}


}
