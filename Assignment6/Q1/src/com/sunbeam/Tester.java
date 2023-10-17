package com.sunbeam;

public class Tester {

	public static void main(String[] args)
	{
		Manager m = new Manager();
		m.accept();
		m.display();
		
		Box<Manager> b1 = new Box<>();
		b1.setObj(m);
		System.out.println("Total salary of Manager : "+b1.getTotalSalary());
		
		Salesman s = new Salesman();
		s.accept();
		s.display();
		
		Box<Employee> e1 = new Box<Employee>();
		e1.setObj(s);
		System.out.println("Total Salary of Employee : "+e1.getTotalSalary());
		
		
		

	}

}
