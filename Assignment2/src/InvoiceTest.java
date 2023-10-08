/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/


import java.util.Scanner;
 class Invoice
{
	String part_number;
	String part_description;
	int quantity;
	double price;
	
	Scanner sc = new Scanner(System.in);
	
	public Invoice() 
	{
		this.part_description = "";
		this.part_number = "";
		this.price = 0;
		this.quantity = 0;
		
	}

	public Invoice(String part_number, String part_description, int quantity, double price) {
		
		this.part_number = part_number;
		this.part_description = part_description;
		this.quantity = quantity;
		this.price = price;
	}
	
	

	public String getPart_number() {
		return part_number;
	}

	public void setPart_number(String part_number) {
		this.part_number = part_number;
	}

	public String getPart_description() {
		return part_description;
	}

	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
		this.quantity = quantity;
		}
		else this.quantity = 0;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public void calculateAmount()
	{
		double total;
		System.out.println("Total Amount = " +this.quantity*this.price );
		
	}
}
public class InvoiceTest{
	
	public static void main(String[] args) {
		 Invoice i1= new Invoice(" 01" ,"bycycle",12,234.50);
		 Invoice i2 = new Invoice("02","opl",14,666.21);
		 
		 System.out.println("Invoice 01");
		 System.out.println("Part Number : " +i1.getPart_number());
		 System.out.println("Part Description : " +i1.getPart_description());
		 System.out.println("Quantity : " +i1.getQuantity());
		 System.out.println("Price : " +i1.getPrice());		 
		 
		 
		 
		 
		 
		 
	}
}
	
	
	
	
	
	
	
	
	
	
