package com.ran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ArrayListClass {

	public static void main(String[] args) {
		
		/*Integer intType=new Integer(1);
		int a=intType.intValue();
		System.out.println(a);
	    String s=intType.toString();
	    int b=Integer.parseInt(s);
	    System.out.println(b);
	    String s1=Integer.toString(2);
	    System.out.println(s1);
	    Integer inttype1=Integer.valueOf(5);*/
		Vector<Integer> v=new Vector<Integer>();
		Integer it=2;
		Integer it1=new Integer(2);
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(3));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(4));
		arrayList.add(new Integer(6));
		arrayList.add(new Integer(5));
	
		arrayList.add(1, 7);
		System.out.println("integervalue="+(it==it1?"can check":"can not check"));
		if(it.equals(it1)){System.out.println("integer value compare equals");}
		//Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList.remove(2));
		try{
		for(int i=0;i<(arrayList.size()-1);i++){
			
			for(int j=1;j<arrayList.size()-1;j++){
				
				if(arrayList.get(j).intValue()>arrayList.get(j+1).intValue()){
					
					int temp=arrayList.get(j).intValue();
					int temp1=arrayList.get(j+1).intValue();
					
					/*arrayList.add(j, new Integer(temp));
					arrayList.add(i, new Integer(temp1));
					*/
					arrayList.set(j+1, new Integer(temp));
					arrayList.set(j, new Integer(temp1));
					
				}
				
			}
			
			
		}
		}
		catch(Exception e){System.out.println("exception throw");}
		
		System.out.println(arrayList);
		for(int i=0;i<10;i++){
		 int x = (int) (Math.random()*10);
		 
		 System.out.print(x+" ");
		}
	}

}
