/*
1. In menu-driven program of Books (with ArrayList - Day12 Q1)
add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream.
*/


package com.question2;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;



public class TesterStoreBook 
{
		static int menu() {
		System.out.println("**************************************************");
		System.out.println("0.EXIT");
		System.out.println("1.Save books in ﬁle");
		System.out.println("2.Load books from ﬁle");
		System.out.println("Enter your choice = ");
		
		int choice = new Scanner(System.in).nextInt();
		System.out.println("**************************************************");
		return choice;
	}
		
		public static void writeBooks()
		{
			List<StoreBook>list = new ArrayList<StoreBook>();
			list.add(new StoreBook("sdsd",40,"sds",5));
			
			try(FileOutputStream fout = new FileOutputStream("Books.txt"))
			{
				try(ObjectOutputStream oout = new ObjectOutputStream(fout))
				{	
					
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		public static void readBooks()
		{
			//List<StoreBook>list = new ArrayList<StoreBook>();
			StoreBook bk = new  StoreBook();

			try(FileInputStream fin = new FileInputStream("Books.txt"))
			{
				try(ObjectInputStream oin = new ObjectInputStream(fin))
				{
					
					while(true)
					{
						bk = (StoreBook) oin.readObject();
						System.out.println(bk);
					}
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
	
	
		
		
	
	
	public static void main(String[] args) throws Exception {
		int choice;
		
		
		Scanner sc = new Scanner(System.in);		
		while((choice=menu())!=0) {
			switch(choice) {
			case 1:	
				writeBooks();
				System.out.println("Book Saved in file.");
				break;
				
			case 2:
				readBooks();
				System.out.println("Books Loaded in File");
				break;
				
			
				
				
			default:
				System.out.println("Wrong choice...:(");
				break;
			}
		}
		System.out.println("Thank you for using our app...:)");
	}
}









