package Assignment2_2;

public class EmployeeTest {

	public static void main(String[] args)
	{
		Employee e1 = new Employee("Scott","Johnson",200);
		Employee e2 = new Employee("John", "Cena", 150);
		
		System.out.println("Before Raise in salary");
		System.out.println("***********************");
		System.out.println("1.Employee");
		System.out.println("Name : " +e1.getFirst_name()+ " "+e1.getLast_name());
		System.out.println("Yearly Salary : "+e1.getyearlySalary());
		System.out.println("***********************");

		System.out.println("2.Employee");
		System.out.println("Name : " +e2.getFirst_name()+ " "+e2.getLast_name());
		System.out.println("Yearly Salary : "+e2.getyearlySalary());
		System.out.println("***********************");
		
		System.out.println("---------------------");
		System.out.println("After Raise in Salary");
		System.out.println("---------------------");
		
		e1.salaryRaise(10);
		e2.salaryRaise(10);
		
		System.out.println("***************************************");
		System.out.println("Emplyee 1 Yearly Salary after Raise : "+e1.getyearlySalary());
		System.out.println("Emplyee 2 Yearly Salary after Raise : "+e2.getyearlySalary());
		System.out.println("***************************************");

	}

}
