package com.chainsys.collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Properties;

public class DictionaryPropDemo {
    public static void main(String args[])
    {
    Properties capitals = new Properties ();//Properties<String> capitals = new Properties
    Set<Object> states; // Set<string> states

    String str;

    capitals.put ("Illinois", "springfield");

    capitals.put ("Florida", "Tallahassee"); 
    capitals.put ("Missouri", "Jefferson City");

    capitals.put ("Washington", "Olympia");

    capitals.put ("California", "Sacramento");

    capitals.put ("Indiana", "Indianapolis");

    states = capitals.keySet (); //get set-view of keys

    Iterator<Object> itr = states.iterator ();

    while (itr.hasNext())
    {
    str=(String) itr.next ();

    System.out.println("The capital of "+str + " is " +capitals.getProperty(str)+ ".");
    }
    // look for state not in list specity default
    str=capitals.getProperty("TamilNadu","Not found");
    System.out.println("the capital of TamilNadu is"+ str);
}
}
