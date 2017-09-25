package Mapping;

import java.util.*;

public class HashMapDemo {
	
	public static void main(String args[])
	{
		TreeMap<Integer,String>map = new TreeMap<Integer,String>();
		
		map.put(100,"Yin");
		map.put(10,"Ma");
		map.put(100,"Za");
		map.put(20,"Tin");
		
		
		System.out.println(map);				 // print all key and value
		
		Set<Integer> keys = map.keySet();		// Abstract the Key Integer from the map
		System.out.println(keys);				// Print the key only
		
		Collection<String> val =  map.values();	// Abstract the value from the map
		System.out.println(val);
		
		Collection<String> col = map.values();
		//ArrayList l = (ArrayList)col;
		
		System.out.println(col);
		
	}

	
}
