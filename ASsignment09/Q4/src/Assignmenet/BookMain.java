package Assignmenet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) 
	{
		List<Book>list = new ArrayList<>();
		Book b;
		int index;
		int choice = new Scanner(System.in).nextInt();
		
				do {
			System.out.println("1.Add new book in list.");
			System.out.println("2.Display all books in forward order.");
			System.out.println("3. Delete at book given index");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order");
			System.out.println("Enter Your Choice :");
			

		switch(choice)
		{
			case 1:
				b = new Book();
				b.accept();
				list.add(b);
				break;
				
			case 2:
				for(Book bk : list)
					System.out.println(bk);
				
			case 3:
				System.out.println("Enter index at which element to be deleted ");
				Scanner sc = new Scanner(System.in);
				index = sc.nextInt();
				list.remove(index);
				break;
				
			case 4:
				Scanner Sc = new Scanner(System.in);
				String isbn = Sc.next();
				Book key = new Book();
				key.setIsbn(isbn);
				if(list.contains(key))
					System.out.println("Found");
					else
						System.out.println("Not Found");
				break;
				
			case 5:
				list.clear();
				break;
				
			case 6:
				System.out.println("Size : "+list.size());
				break;
				
			case 7:
				class BookPriceComparator implements Comparator <Book>
				{

					@Override
					public int compare(Book b1, Book b2)
					{
						int diff = - Double.compare(b1.getPrice(),b2.getPrice());
						
						return diff;
					}
					
				}
				
				BookPriceComparator comparator = new BookPriceComparator();
				list.sort(comparator);
				break;
				
		}

	} while(choice != 0);

}
}
