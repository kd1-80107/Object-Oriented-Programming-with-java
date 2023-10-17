package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee
{
	private double comm;

	public Salesman() {
		
		
	}

	public Salesman(int id, double sal,double comm) {
		super(id, sal);
		
	}
	
	public void accept()
	{
		super.accept();
		System.out.println("Enter a Commision : ");
		this.comm = new Scanner(System.in).nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("Commision : "+this.comm);
	}

	@Override
	double calculateSalary() {
		return this.getSal()+this.comm;
	}
	
	
}
