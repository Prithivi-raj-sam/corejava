package com.chainsys.collections;
import java.util.ArrayDeque;
import java.util.Iterator;
public class ArraDequeDemo {
	public static void main(String[] args) {
        

        ArrayDeque<String> arraydeque =new ArrayDeque<String>();
        //Use an ArrayDeque like a Stack
        arraydeque.push("A");
        arraydeque.push("B");
        arraydeque.push("X");
        arraydeque.push("Z");
        arraydeque.push("D");
        arraydeque.push("X"); //DUPLICATE VALUES
        arraydeque.push("Z"); //DUPLICATE VALUES
        arraydeque.push("E");
        arraydeque.push("F");
        arraydeque.offer("F");
        
        arraydeque.pop();
//        
//        System.out.println("Before popping the stack : "+arraydeque.size());
//        while(arraydeque.peek() !=null)
//        {
//            System.out.print(arraydeque.pop() + " ");
//        }
//        System.out.println(" After popping the stack : "+arraydeque.size());
        
        Iterator<String> iterator =arraydeque.iterator();
        while(iterator.hasNext()) {
        	System.out.print("\t"+iterator.next());
        }
        System.out.println();
        Iterator<String> iterator1 =arraydeque.descendingIterator();
        while(iterator1.hasNext()) {
        	System.out.print("\t"+iterator1.next());
        }
        System.out.println();
        arraydeque.addFirst("H");
        arraydeque.addLast("I");
//        arraydeque.add("I");
        Iterator<String> iterator2 =arraydeque.iterator();
        while(iterator2.hasNext()) {
        	System.out.print("\t"+iterator2.next());
        }
        //poll first
        //retrives and removes the first element of this deque er
        //return null if this deque is empty
        System.out.println();
        System.out.println("*********Pollfirst:"+ arraydeque.pollFirst());
        System.out.println(arraydeque);
        System.out.println("*********PollLast:"+ arraydeque.pollLast());
        System.out.println(arraydeque);

        System.out.println("*********Peekfirst:"+ arraydeque.peekFirst());
        System.out.println(arraydeque);
        System.out.println("*********PeekLast:"+ arraydeque.peekLast());
        System.out.println(arraydeque);

        System.out.println("*********removefirst:"+ arraydeque.removeFirst());
        System.out.println(arraydeque);
        System.out.println("*********removeLast:"+ arraydeque.removeLast());
        System.out.println(arraydeque);
    }

}
