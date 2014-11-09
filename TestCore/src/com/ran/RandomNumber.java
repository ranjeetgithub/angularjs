package com.ran;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		/*Employee e=new Employee(4);
		Employee1 e1=new Employee1(4);
if(e.equals(e1)){System.out.println("true");}else{System.out.println("false");}*/
		
		log("Generating 10 random integers in range 0..99.");
	    
	    //note a single Random object is reused here
	    Random randomGenerator = new Random();
	    for (int idx = 1; idx <= 10; ++idx){
	      int randomInt = randomGenerator.nextInt(100000);
	    	//int randomInt=(int)(1000000*Math.random());
	      log("Generated : " + randomInt);
	    }
	    
	    log("Done.");

	}
	private static void log(String aMessage){
	    System.out.println(aMessage);
	  }

}
