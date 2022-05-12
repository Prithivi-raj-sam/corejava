package com.chainsys.strings;
/**
 * @author prit3136
 *java.lang.StringBuffer

append(String ) // add string to the end of SB
insert(int,String ) //add string to the index position of the SB
replace( ) // replace a word
delete( int,int)

ensureCapacity(int) //allocates Memory, does not reduce the size
setLength(int ) // truncate data

reverse( )
deleteCharAt( )
charAt(int ) // get Char from index 
setCharAt( ) // replace a char 
trimToSize() // set the capacity to the length
substring(int)

Use StringBuffer or StringBuilder to modify a String Multiple times 
StringBuffer is  synchronized and used in MultiThreaded (multiuser) Environment
J2SE 5 adds a new String class called StringBuilder.
StringBuilder is not synchronized and used in SingleThreaded (singleuser) Environment
StringBuilder is identical to StringBuffer
 */
public class StringBuilderDemo {
	public static void testA() {
		String firstString = "hello how are you today";
		StringBuilder Stringbuilder =new StringBuilder();
//		Stringbuilder.ensureCapacity(250);
		// pre allocated memory for capacity 
		System.out.println("length ="+ Stringbuilder.length());
		System.out.println("capacity ="+ Stringbuilder.capacity());
		Stringbuilder.append(firstString);
		System.out.println("buffer ="+ Stringbuilder);
		System.out.println("length ="+ Stringbuilder.length());
		System.out.println("capacity ="+ Stringbuilder.capacity());
		
		firstString = "wish it rains this week";
		Stringbuilder.append(firstString);
		System.out.println("buffer"+ Stringbuilder);
		System.out.println("length ="+ Stringbuilder.length());
		System.out.println("capacity ="+ Stringbuilder.capacity());
		
		Stringbuilder.trimToSize();
		System.out.println("\tlength ="+ Stringbuilder.length());
		System.out.println("\tcapacity ="+ Stringbuilder.capacity());
		 //replace
		Stringbuilder.replace(3,8,"-this is s Test--");
		System.out.println("\treplace ="+ Stringbuilder);
		
		
		Stringbuilder.insert(10,"-this is augest-");
		System.out.println("insert ="+ Stringbuilder);
		System.out.println("\tlength ="+ Stringbuilder.length());
		System.out.println("\tcapacity ="+ Stringbuilder.capacity());
	
		Stringbuilder.delete(5,20);
		System.out.println("delete="+ Stringbuilder);
		System.out.println("\tlength ="+ Stringbuilder.length());
		System.out.println("\tcapacity ="+ Stringbuilder.capacity());	
	}   
}
