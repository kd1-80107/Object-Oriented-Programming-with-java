package Assignment6_2;

public class Tester {
	public static void printDisplayBox(Box<? extends Displayable> b)
	{
		b.get().show();
	}
	
	public static void PrintBox(Box<?>b)
	{
		System.out.println(b.get().toString());
	}

	public static void main(String[] args)
	{
		Box<Person> b1 = new Box<Person>();
		b1.set(new Person("Nilesh",30));
		printDisplayBox(b1);
		
		Box<Date> b2 = new Box<Date>();
		b2.set(new Date(4,5,6));
		printDisplayBox(b2);
		
		/*Box<String> b3 = new Box<String>();
		b3.set("HIIIIIII");
		printDisplayBox(b3);*/
		
		PrintBox(b1);
		PrintBox(b1);
		

	}

}
