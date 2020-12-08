package org.example.gauravk;

import java.util.Iterator;
import java.util.Stack;

public class Day55_Stack_operations {

    public static void main(String[] ar)
    {
        System.out.println("Implementing all methods of stack in Java ");
        Stack<Integer> st = new Stack<>();
        System.out.println("Add Elements in stack via push method ");
        push(st,10);
        push(st,20);
        push(st,30);
        push(st,40);
        System.out.println("Lets check the stack data "); // + here you cant add something which returns nothing
        printStack(st);
        System.out.println("Taking out the top element via pop == " + pop(st));
        System.out.println("Check who is at the top now == " + peek(st));
        System.out.println("lets check if we have the element in the stack, returns -1 or index+1"+search(st,10));
        System.out.println("Lets check if stack is empty  == " + emptyStack(st));

        System.out.println("Lets see whats left out if anything in stack");
        printStack(st);


    }
    public static void push(Stack<Integer> st, Integer i)
    {
        st.push(i);
    }

    public static Integer pop(Stack<Integer> st)
    {
        return st.pop();
    }
    public static Integer peek(Stack<Integer> st)
    {
        return st.peek();
    }

    public static Integer search(Stack<Integer> st,Integer I)
    {
        return st.search(I);
    }

        public static void printStack(Stack<Integer> st)
    {
        Iterator it = st.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static boolean emptyStack(Stack<Integer> st)
    {
        return st.empty();

    }
}


