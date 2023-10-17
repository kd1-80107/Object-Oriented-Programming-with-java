package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee
{
	private double bonus;
	
	public Manager() {
		
	}

	public Manager(int id, double sal,double bonus) {
		super(id, sal);
		
	}
	
	public void accept() {
        super.accept();
        System.out.println("Enter bonus : ");
        this.bonus= new Scanner(System.in).nextDouble();
    }
    public void display()
    {
    	super.display();
        System.out.println("Bonus :" +this.bonus);
    }

	@Override
	double calculateSalary() {
		
		return this.getSal()+this.bonus;
	}
        
    
	
	
}