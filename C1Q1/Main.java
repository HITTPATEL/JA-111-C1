package com.C1Q1;

public class Main {

	
	public static void main(String[] args) {
		
		
		String x= "Ram";
		System.out.println(x);
		
		// We can add string toStringBulder class but not String class
		StringBuilder y=new StringBuilder(x);
		y.append("Shyam");
		System.out.println(y);
		
//		
		
		
		
	}
}

//Question 1:
//Why String is immutable in java and what is the difference between String and String Builder? And Write some
//of the methods of String class at least 5 with example.

//Answer 1:
//String are immutable in Java because if there are 3 reference variable, all refer to one  object. If one reference
//variable changes the value of the object, it will affect by all the reference variable.

// If we want to make String as immutable ,we can also use StringBuilder or StringBuffer class.
