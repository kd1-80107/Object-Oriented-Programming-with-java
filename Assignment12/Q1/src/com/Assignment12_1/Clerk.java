package com.Assignment12_1;

public class Clerk implements Emp
{
	double sal;


	@Override
	public double getSal() {
		
		return sal;
	}

	public Clerk(double sal) {
		this.sal = sal;
	}
	
	
}
