package com.chainsys.collections;
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Iterator;
public class StackDemo {
	public static void main(String args[])
    {
        Stack<Integer> st=new Stack<Integer>(); //lifo method
        System.out.println("stack: "+st.size());
        st.push(99);
        st.push(66);
        st.push(null);
        st.push(99);
        st.push(42);
        st.add(44);
        System.out.println("stack: "+st.size());
        Iterator<Integer> int_itr=st.iterator();
        while(int_itr.hasNext())
        {
            System.out.println(int_itr.next());
        }
        System.out.println();
        Integer a=st.peek();
        System.out.println(a);
        System.out.println("After POP stack: "+st.size());
        a=st.pop();
        System.out.println(a);
        System.out.println("After POP stack: "+st.size());
        a=st.pop();
        System.out.println(a);
        System.out.println("After POP stack: "+st.size());
        try
        {
            a=st.pop();
            System.out.println(a);
        }
        catch(EmptyStackException e)
        {
            System.out.println("Empty stack: "+e.getMessage());
        }
    }


}
