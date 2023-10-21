/*
1. In menu-driven program of Books (with ArrayList - Day12 Q1)
add two more menus. Save books in ﬁle and load books from ﬁle. Use DataOutputStream
and DataInputStream.
*/


package com.question1;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
			try(FileOutputStream fout = new FileOutputStream("books.txt"))
			{
				try(DataOutputStream dout = new DataOutputStream(fout))
				{
					StoreBook bk = new StoreBook();
					bk.accept();
					dout.writeUTF(bk.getIsbn());
					dout.writeDouble(bk.getPrice());
					dout.writeUTF(bk.getAuthorName());
					dout.write(bk.getQuantity());
					
				}
			}catch(Exception e) 
			{
				e.printStackTrace();
			}
		
		}
		
		public static void readBooks()
		{
			try(FileInputStream fin = new FileInputStream("books.txt"))
			{
				try(DataInputStream din = new DataInputStream(fin))
				{
					StoreBook bk = new StoreBook();
					while(true)
					{
						bk.setIsbn(din.readUTF());
						bk.setPrice(din.readDouble());
						bk.setAuthorName(din.readUTF());
						bk.setQuantity(din.readInt());
						
					}
				} catch(EOFException e)
				{
					
				}
			} catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	
	public static void main(String[] args) throws Exception {
		int choice;
		
		int index;
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









