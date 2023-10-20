package com.assignment11_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookTester { 

	public static void main(String[] args)
	{
		Set<Books> set = new HashSet<>();
		/*
		elements are stored into insertion order.
		Books are also with duplicate ISBN.
		To prevent the problem of duplicate ISBN we
		have to provide equals method as well as hashCode method.
		*/
		
		//adding books
		
		set.add(new Books("Abc","Wings of fire","Apj",10,220.0));
		set.add(new Books("Xyz","Yugandhar","Shree",25,620.0));
		set.add(new Books("HHM","ShreemanYogi","Ranjeet Desai",100,760.0));
		set.add(new Books("DV","Chhava","Shivaji Sawant",101,730.0));
		set.add(new Books("DV","Chhava","Shivaji Sawant",101,730.0));
		set.add(new Books("Xyz","Ugandhar","Shree",25,620.0));
		
		
		Iterator<Books> itr = set.iterator();
		while(itr.hasNext())
		{
			Books bk = itr.next();
			System.out.println(bk);
			
		}
		

	}

}
