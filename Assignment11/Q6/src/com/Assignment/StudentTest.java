package com.Assignment;
import java.util.*;


public class StudentTest {

	public static void main(String[] args)
	{
		Map<Integer,Student> map = new HashMap<>();
		
		map.put(1,new Student(1,95.60,"A+"));
		map.put(2,new Student(2,87,"A"));
		map.put(1,new Student(3,79.50,"B"));
		map.put(1,new Student(4,71.64,"B"));
		
		
		
		int choice = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.Insert Student");
			System.out.println("2.Find Student");
			System.out.println("Enter a choice..!");
			int choice1 = sc.nextInt();
			switch(choice1)
			{
			case 1:
				Student s = new Student();
				s.accept();
				map.put(s.getRollno(), s);
				break;
				
			case 2:
				System.out.println("Enter a Roll Number..!");
				int roll = sc.nextInt();
				s = map.get(roll);
				break;
			}
			
		}while(choice !=0);
		

	}

}
