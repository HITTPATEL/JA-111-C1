package com.C1Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter Number of Students you want to enter :");
		int number=input.nextInt();
		
		for(int i=1; i<=number; i++) {	
			
			System.out.println("=====================================");
			
		    System.out.println("Enter Roll Number :");
		    int roll=input.nextInt();
		    
		    input.nextLine();
		    System.out.println("Enter the Name:");
		    String name=input.nextLine();
		    
		    System.out.println("Enter the Marks :");
		    int marks=input.nextInt();
		    
		    s.setrollNumber(roll);
		    s.setMarks(marks);
		    s.setStudentName(name);
		    
		    System.out.println("Student Detail "+i);
		    System.out.println("Student Roll Number "+ s.getrollNumber());
		    System.out.println("Student Name "+s.getStudentName());
		    System.out.println("Student Marks "+ s.getMarks());
		    
		}
		
		
	}

}
