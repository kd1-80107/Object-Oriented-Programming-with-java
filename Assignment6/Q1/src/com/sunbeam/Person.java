/*
1. Copy Person class and inherited classes (Employee, Salesman, Manager, SalesManager) from previous assignment/classwork. Implement generic class
Box so that it can store any Person in it. How to get total salary of the Employee in Box?
*/




package com.sunbeam;

import java.util.Scanner;

public class Person 
{
	
	private String name ;
	
	public Person()
	{
		
	}

	public Person(String name) {
	
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void accept() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name : ");
		this.name = sc.next();
	}
	
	public void display()
	{
		System.out.println("Name : "+this.name);
	}
	
	
}
