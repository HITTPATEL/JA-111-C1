

package com.C1Q2;

import java.util.Scanner;

public class Course {
	static int courseId; 
    static String courseName;
    static int courseFee; 
    
    public void displayCourseDetails() {
    	System.out.println("Course id is "+courseId);
    	System.out.println("Course Name is "+courseName);
    	System.out.println("Course Feee is "+courseFee);
    }
    
    public static void authenticate(String  username, String password) {
    	if(username=="Admin"  && password=="1234") {
    		Course c1=new Course();
    		c1.displayCourseDetails();
    	}
    	else {
    		System.out.println("Invalid username and password");
    	}
    }
    
    public static void main(String[] args) {
    	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Course Name");
		String courseName=input.nextLine();
		
		System.out.println("Enter Couse ID");
		int courseId=input.nextInt();
    	
		System.out.println("Enter Couse Fee");
		int courseFee=input.nextInt();
		
		Course c1=new Course();
		c1.courseName=courseName;
		c1.courseFee=courseFee;
		c1.courseId=courseId;
    	 
		
//		authenticate("Admin", "1234");
		
		authenticate("dasf","8884");
		
	}

}
