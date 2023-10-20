package com.Assignment12_1;

public class Manager implements Emp
{
	private double basicSalary;
	private double dearanceAllowance;
	
	@Override
	public double getSal() {
		
		return basicSalary + dearanceAllowance;
	}

	@Override
	public double calcInsentives() 
	{
		
		return basicSalary*0.2;
	}

	public Manager(double basicSalary, double dearanceAllowance) {
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}
	
	
	
	
}
