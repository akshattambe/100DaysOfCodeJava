package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    int i;
    static int j;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public void printMsg(){
//        testStatic();
        System.out.println(i);
        System.out.println(j);
    }

    public static void testStatic(){
//        printMsg();
//        System.out.println(i);
        System.out.println(j);
    }
}
