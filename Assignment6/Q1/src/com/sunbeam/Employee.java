/**
 * 
 */
package com.sunbeam;

import java.util.Scanner;

public abstract class Employee extends Person{

		private int id;
		private double sal;
		
	
		public Employee() {
		     this(0,0);
		}
		public Employee(int id, double sal) {
	        this.id = id;
	        this.sal = sal;
		}
		public void accept() {
			super.accept();
			
	        System.out.println("Enter Employee id : ");
	        this.id= new Scanner(System.in).nextInt();
	        System.out.println("Enter salary : ");
	        this.sal= new Scanner(System.in).nextDouble();
	    }
	    public void display() {
	    	super.display();
	    	System.out.println("**************");
	        System.out.println(" Employee ID : "+this.id);
	        System.out.println(" Salary : "+this.sal);
	    }
	    public int getId() {
	        return this.id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }
	    public double getSal() {
	        return this.sal;
	    }
	    public void setSal(int sal) {
	        this.sal = sal;
	    }
	    
		abstract double calculateSalary();
		
	    
}