package com.assignment10;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) 
	{
		List<Book>list = new ArrayList<>();
		Book b = null;
		int index;
		int choice;
		int quantity = 0;
		
		//ListIterator <Book> itr;
		
				do {
					
			System.out.println("1.Add new book in list.");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("Enter Your Choice :");
			choice = new Scanner(System.in).nextInt();
			

		switch(choice)
		{
			case 1:
				b = new Book();
				b.accept();
				list.add(b);
				break;
				
			case 2:
				System.out.println("books in forward order using random access");
				Collections.shuffle(list);
				System.out.println(list);
				break;
				
			case 3:
				System.out.println("Enter isbn ");
				String isbn = new Scanner(System.in).next();
				Book key = new Book();
				key.setIsbn(isbn);
				index = list.indexOf(key);
				if(index == -1)
				{
					System.out.println("Book not found");
				}
				else
					System.out.println("Book found at index :" +index);
					b = list.get(index);
					System.out.println(b);
				break;
				
			case 4://delete a book by given index
				
				System.out.println("delete a book by given index");
				int index2 = new Scanner(System.in).nextInt();
				list.remove(index2);
				break;
				
			case 5:
				System.out.println("Enter isbn ");
				String isbn1 = new Scanner(System.in).next();
				Book key1 = new Book();
				key1.setIsbn(isbn1);
				index = list.indexOf(key1);
				if(index == -1)
				{
					System.out.println("Book not found");
				}
				else
					System.out.println("Book found at index :" +index);
					b = list.get(index);
					list.remove(index);
					System.out.println(b);
				
				break; 
				
			case 6: //reverse list
				System.out.println("Reverse the list");
				Collections.reverse(list);
				System.out.println(list);
				
				
				break;
				
			
				
		}

	} while(choice != 0);

}
}