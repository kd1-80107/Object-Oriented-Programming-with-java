/*
  3. In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. If any book with duplicate isbn is added, what will happen?
		Books are stored in which order?
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BooksTest{

	public static void main(String[] args)
	{
		Set<Books> set = new LinkedHashSet<>();
		
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
