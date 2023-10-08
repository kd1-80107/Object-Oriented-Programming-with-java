/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/


package Assignment2_2;

public class Employee 
{
	String first_name;
	String last_name;
	double monthly_salary;
	
	
	public Employee() 
	{
		this.first_name = "";
		this.last_name = " ";
		this.monthly_salary = 0;
	}


	public Employee(String first_name, String last_name, double monthly_salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.monthly_salary = monthly_salary;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public double getMonthly_salary() {
		return monthly_salary;
	}


	public void setMonthly_salary(double monthly_salary) {
		if(this.monthly_salary > 0)
		{	
		this.monthly_salary = monthly_salary;
		}
		else {
			this.monthly_salary = 0;
		}
	}
	
	public double getyearlySalary()
	{
		return this.monthly_salary*12 ;
	}
	
	public void salaryRaise(double percentage)
	{
		if(percentage > 0)
		{
			this.monthly_salary = this.monthly_salary * (1+percentage/100);
		}
	}

}

