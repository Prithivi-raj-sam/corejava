package com.chainsys.unittest;

import com.chainsys.classandmethods.Book;
public class Booktest {
    public static void testBook() {
    	Book bookobject=new Book(123);
    	bookobject.setBookname("physology");
    	bookobject.setAuthor("prithivi");
    	bookobject.setPrice(4000);
    	System.out.println(bookobject.prithivi());
    	System.out.println(bookobject.getAuthor());
    	System.out.println(bookobject.getPrice());
    	System.out.println(bookobject.getBookSerialNo());
    }
    public static void print() {
    	System.out.println(author);
    }
}
