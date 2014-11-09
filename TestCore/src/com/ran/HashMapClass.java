package com.ran;

import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "ranjeet");
		hashMap.put(2, "ajeet");
		hashMap.put(3, "jeet");
		hashMap.put(4, "ram");
		System.out.println(hashMap);
		
		Set<Integer> s=hashMap.keySet();
		for(Integer s1:s){
			System.out.println(hashMap.get(s1));
		}

	}

}
