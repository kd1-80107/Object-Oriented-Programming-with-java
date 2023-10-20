import java.util.Scanner;

public class MainArth {
	
	static void calculate(double num1, double num2,Arithmetic op)
	{
		double result = op.calc(num1, num2);
		System.out.println("Result : " +result);
		
	}
	
	static int menu()
	{
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter a choice");
		int choice = new Scanner(System.in).nextInt();
		return choice;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		
		while((choice = menu()) != 0)
		{
			switch(choice)
			{
			case 1:
				//Calculate (num1,num2(x,y) -> x + y)
				calculate(1,2,(a,b) -> a+b);
				break;
				
			case 2:
				calculate(6,4,(a,b)-> a-b);
				break;
				
			case 3:
				calculate(10,20,(a,b) -> a*b);
				break;
				
			case 4:
				calculate(625,25,(a,b) -> a/b);
				break;
				
				default :
					 System.out.println("Bye");
				
			}
		}
	}

}
