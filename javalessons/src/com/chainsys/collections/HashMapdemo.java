package com.chainsys.collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class HashMapdemo {
	public static void usingGenericMapdemo() {
		HashMap<String,String> SecondMap =new HashMap<String,String>();
		System.out.println(SecondMap.size());
		SecondMap.put("k1","ABcd");
		SecondMap.put("k5","ABcd");
		SecondMap.put("k3","ABcd");
		SecondMap.put("k4","tyu");
		SecondMap.put("k4",null);
		System.out.println("Size "+SecondMap.size());
		Set<Map.Entry<String, String>> setofMapEntry = SecondMap.entrySet ();
		Iterator<Map.Entry<String, String>> mapIterator = setofMapEntry.iterator ();
		while (mapIterator.hasNext ())
        {
        Map.Entry<String, String> mapEntry =(Map.Entry<String, String>) mapIterator.next(); 
        
        System.out.print (mapEntry.getKey() + ": ");
        System.out.println (mapEntry.getValue () );
        }
		
		for(Map.Entry pairEntry :SecondMap.entrySet()) {
			System.out.println(pairEntry.getKey()+":"+pairEntry.getValue());
		}
//		SecondMap.containsKey("k1");   //return true
		//SecondMap.containsValues("ABcd");  //return true
//		SecondMap.remove(key:"k1");
	}
}
