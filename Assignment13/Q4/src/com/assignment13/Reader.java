package com.assignment13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Reader {

	public static void main(String[] args) 
	{
		
//		try
//		{
//		FileWriter fw = new FileWriter("File.txt");
//		
//		BufferedWriter bw = new BufferedWriter(fw);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a line : ");
//		
//		for(int i = 0; i<=4; i++)
//		{	
//			String line = sc.nextLine();
//			bw.write(line);
//			bw.newLine();
//		}
//			System.out.println("Text line is written..!");
//		
//		}
//			catch (Exception e) 
//			{
//				e.printStackTrace();
//			}
		try
		{
		FileReader fr = new FileReader("File.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}
