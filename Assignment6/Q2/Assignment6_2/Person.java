package Assignment6_2;

import java.util.Scanner;

public class Person implements Displayable
{
	private String name;
	private int age ;
	
	public Person() {
	
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void accept()
	{
		
		System.out.println("Enter a Name : ");
		String name = new Scanner(System.in).next();
		
		System.out.println("Enter a Age : ");
		int age = new Scanner(System.in).nextInt();
	}
	
	public void display()
	{
		System.out.println("Name :" +this.name);
		System.out.println("Age : " +this.age);
	}

	@Override
	public void show() {
		
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
