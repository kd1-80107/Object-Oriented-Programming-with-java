package com.assignment13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class BufferTest {

	public static void main(String[] args)
	{
		try
		{
		FileWriter fw = new FileWriter("File.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line : ");
		
		for(int i = 0; i<=4; i++)
		{	
			String line = sc.nextLine();
			bw.write(line);
			bw.newLine();
		}
			System.out.println("Text line is written..!");
		
		}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		
		
		
		
				

	}

}
