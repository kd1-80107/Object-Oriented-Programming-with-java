package com.Assignment12_1;

public class EmpMain {

	public static void main(String[] args) {
		
		Emp [] arr = new Emp[3];
		
		arr[0] = new Manager(50,6);
		arr[1] = new Labour(10,3);
		arr[2] = new Clerk(10);
		
		double totalIncome = Emp.calcTotalIncome(arr);
		System.out.println(totalIncome);

	}

}
