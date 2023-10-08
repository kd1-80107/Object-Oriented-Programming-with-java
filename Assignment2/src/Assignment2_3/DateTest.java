package Assignment2_3;

public class DateTest {

	public static void main(String[] args) {
		
		Date d1 = new Date(27,11,2000);
		//Date d2 = new Date(07,11,1997);
		
		d1.display();
		//d2.display();
		
		d1.setDay(7);
		d1.setMonth(11);
		d1.setYear(1997);
		
		System.out.println("After using Set method new Date : ");
		d1.display();
		

	}

}
