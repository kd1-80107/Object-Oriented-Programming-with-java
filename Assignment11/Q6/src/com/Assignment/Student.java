package com.Assignment;

import java.util.Scanner;

public class Student 
{
	int rollno;
	double marks;
	String grades;
	
	public Student()
	{
		
	}
	
	public Student(int rollno, double marks, String grades) {
		//super();
		this.rollno = rollno;
		this.marks = marks;
		this.grades = grades;
		
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getGrades() {
		return grades;
	}

	public void setGrades(String grades) {
		this.grades = grades;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Roll number :");
		this.rollno = sc.nextInt();
		
		System.out.println("Enter a marks :");
		this.marks = sc.nextDouble();
		
		System.out.println("Enter a Grades :");
		this.grades = sc.next();
	}	
	
	public void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll number :"+this.rollno);
		System.out.println("Marks :" +this.marks);
		System.out.println("Grades :" +this.grades);
		
	}	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + ", grades=" + grades + "]";
	}
	
	
	
	
}
