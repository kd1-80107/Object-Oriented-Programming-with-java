package com.assignment10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class TestString {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		
		String maxLength = Collections.max(list, new Comparator<String>()
		{

			@Override
			public int compare(String s1, String s2) {
				
				return Integer.compare(s1.length(),s2.length());
			}
		});
			System.out.println("string with max length = "+maxLength);

	}

}
