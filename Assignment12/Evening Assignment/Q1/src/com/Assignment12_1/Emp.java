/**
 * 
 */
package com.Assignment12_1;

/**
 * 1. Create an interface Emp with abstract method double getSal() and a default method default double calcIncentives(). The default method
simply returns 0.0. Create a class Manager (with ﬁelds basicSalary and dearanceAllowance) inherited from Emp. In this class override getSal() method
(basicSalary + dearanceAllowance) as well as calcIncentives() method (20% of basicSalary). Create another class Labor (with ﬁelds hours and rate)
inherited from Emp interface. In this class override getSal() method (hours * rate) as well as calcIncentives() method (5% of salary if hours > 300,
otherwise no incentives). Create another class Clerk (with ﬁeld salary) inherited from Emp interface. In this class override getSal() method (salary). Do
not override, calcIncentives() in Clerk class. In Emp interface create a static method static double calcTotalIncome(Emp arr[]) that calculate
total income (salary + incentives) of all employees in the given array.
 *
 */
public interface Emp 
{
	double getSal();
	default double calcInsentives()
	{
		return 0.0;
	}
	
	static double calcTotalIncome(Emp[] arr)
	{
		double total = 0.0;
		for(Emp e : arr)
			total += e.getSal() + e.calcInsentives();
			return total;
		
	}
}
