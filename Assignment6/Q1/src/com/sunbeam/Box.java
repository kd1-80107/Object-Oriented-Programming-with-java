package com.sunbeam;

public class Box<T extends Employee>
{
	private T obj ;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public double getTotalSalary()
	{
		return obj.calculateSalary();
	}
	
}
