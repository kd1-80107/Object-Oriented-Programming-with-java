package Assignment6_2;

import java.util.Scanner;

public class Date implements Displayable 
{
	private int day;
	private int month ;
	private int year ;

	public Date()
	{
		
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Day : ");
		this.day = sc.nextInt();
		
		System.out.println("Month : ");
		this.month = sc.nextInt();
		
		System.out.println("Year : ");
		this.year = sc.nextInt();
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
	
	

}
