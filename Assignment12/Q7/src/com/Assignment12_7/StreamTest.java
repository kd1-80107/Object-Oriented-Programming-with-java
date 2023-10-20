package com.Assignment12_7;

import java.util.Random;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) 
	{
		Random r = new Random();
		
		Stream<Integer> strm = Stream.generate(()->r.nextInt(10)).limit(10);
		int result = strm.reduce(0,(a,e)->a+e);
		System.out.println(result);
	
	}

}
