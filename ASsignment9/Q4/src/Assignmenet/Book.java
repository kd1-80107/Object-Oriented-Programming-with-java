package Assignmenet;

import java.util.Scanner;

public class Book 
{
	String isbn;
	String title;
	String author;
	int quantity;
	double price;
	
	public Book() {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	
	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a isbn : ");
		this.isbn = sc.next();
		
		System.out.println("Enter a Title :");
		this.title = sc.next();
		
		System.out.println("Enter a Author : ");
		this.author = sc.next();
		
		System.out.println("Enter a Quantity : ");
		this.quantity = sc.nextInt();
		
		System.out.println("Enter a Price :");
		this.price = sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Isbn :" +this.isbn);
		System.out.println("Title : "+this.title);
		System.out.println("Author :" +this.author);
		System.out.println("Quantity : "+this.quantity);
		System.out.println("Price : "+this.price);
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", quantity=" + quantity + ", price="
				+ price + "]";
	}
	
	public boolean equals(Object obj)
	{
		Book b = (Book) obj ;
		return true ;
	}
	
	
	
	
	
	
	
}
