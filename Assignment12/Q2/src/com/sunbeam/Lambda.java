package com.sunbeam;

import java.util.function.Predicate;

public class Lambda {
	
	public static void main(String[] args)
	{
		String[] arr = { "Nilesh", "Shubham", "Pratik", "Omkar", "Prashant" };

		//using lambda
		int cnt = countIf(arr,s->s.length() > 6);
			System.out.println("Result: " + cnt); // 2
			
			//using anonymous inner class
			int cnt1 = countIf(arr, new Predicate<String>() {
				public boolean test(String s) {
				return s.length() > 6;
				}
				});
			System.out.println("Result: " + cnt1);

	}
	
	


	public static int countIf(String[]arr, Predicate<String>cond)
	{
		int count = 0;
		for(String str: arr) {
		if(cond.test(str))
		count++;
		}
		return count;
	}
	
	
}


