package org.example.sarojini.pkg2;

import static org.example.sarojini.Day19_StaticImport.*;

/*Execution flow:
Compiler go to main method and search for variable "a",as not found in main method it will search in Day19_StaticImportPkg
class then compiler go to import statement and search for any static import class.So it compiler go to "Day19_StaticImport"
class in another package.There it will search for variable "a". The same way for learning method also.
For nested classes we need to call static variables with class name.
*/
class Day19_StaticImportPkg {
    public static void main(String[] args) {
        System.out.println(a);
        learning();
        System.out.println(inner.b);
        System.out.println(inner.s);
    }
}
