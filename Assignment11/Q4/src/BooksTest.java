/*
4. Use TreeSet to store all books in descending order of price. 
Natural ordering for the Book should be isbn (do not change it). 
Display them using iterator() and descendingIterator().
*/

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BooksTest{

	public static void main(String[] args)
	{		

		class ComparatorPrice implements Comparator<Books>
		{

			@Override
			public int compare(Books b1, Books b2)
			{
				int diff = -Double.compare(b1.getPrice(), b2.getPrice()); 
				return diff;
			}
			
		}
		ComparatorPrice cp = new ComparatorPrice();
		
		TreeSet<Books> set = new TreeSet<>(cp);
		
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
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("descending order");
		Iterator<Books> itr1 = set.descendingIterator();
		while(itr1.hasNext())
		{
			Books bk = itr1.next();
			System.out.println(bk);
			
		}
		

	}

}
