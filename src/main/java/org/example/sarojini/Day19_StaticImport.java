package org.example.sarojini;

/*static import understanding:
1Q:What is static import?
1A:Static Import is a Java 1.5 version feature
2Q:Why We Need static Import?
2A:Till Java 1.4V if we want to access one class static members inanother class we used to access by using class name.
From 1.5V we can access one class static members in another class directly by using their names "Without" using class name.
By Using static import we can access the static members of a class directly with out calling class name explicitly.
3Q.Syntax of static import?
3A.Import static packagename.classname.*;
 */
public class Day19_StaticImport {
    public static int a = 10;

    public static void learning() {
        System.out.println("I am learning about static import");

    }

    public static class inner {
        public static String s = "100 days code";
        public static boolean b;

    }

    public static void main(String[] args) {
        System.out.println(inner.b);//should print default vlaue "false"
        System.out.println(inner.s);

    }
}
