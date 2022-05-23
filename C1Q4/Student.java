package com.C1Q4;

public class Student {
   
	private int rollNumber;
	private String studentName;
	private int marks;
	
	
	public Student(){
		
	}
	public Student(int rollNumber, String studentName, int marks){
		     this.rollNumber=rollNumber;
		     this.studentName=studentName;
		     this.marks=marks;
	}
	
	public void setStudentName(String name) {
		this.studentName=name;
	}
	public String getStudentName() {
		  return studentName;
	}
	
	public void setrollNumber(int roll) {
		this.rollNumber=roll;
	}
	public int getrollNumber() {
		  return rollNumber;
	}
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getMarks() {
		  return marks;
	}
}
