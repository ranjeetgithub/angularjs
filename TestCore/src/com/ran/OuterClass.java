package com.ran;

public class OuterClass {

	//PrivateClass pc1=new PrivateClass();
	private class PrivateClass{
		
		public PrivateClass(){
			System.out.println("privateclass example");
		}
		public void show(){
			System.out.println("show method");
		}
		
	}
	
	
	public void createshow(){
		PrivateClass pc=new PrivateClass();
		pc.show();
	
	}
	
}
