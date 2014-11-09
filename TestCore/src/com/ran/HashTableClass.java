package com.ran;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableClass {

	public static void main(String[] args) {
		Hashtable<Integer,String> htable=new Hashtable<Integer,String>();
		htable.put(1, "ranjeet");
		htable.put(2, "ajeet");
		htable.put(3, "jeet");
		htable.put(4, "rpn");
		htable.put(5, "rini");
		System.out.println("htable="+htable);
		/*Set<Integer> s=htable.keySet();
		
		for(Integer s1:s){
			System.out.println(htable.get(s1));
	}*/
		Enumeration<Integer> e=htable.keys();
		while(e.hasMoreElements()){
			System.out.println(htable.get(e.nextElement()));
		}
		
		

	}

}
