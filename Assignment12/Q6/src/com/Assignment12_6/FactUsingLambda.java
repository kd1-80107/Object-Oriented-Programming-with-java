package com.Assignment12_6;

import java.util.Random;
import java.util.stream.Stream;

public class FactUsingLambda {

	public static void main(String[] args) {
		
	
		Stream <Integer> strm = Stream.iterate(1, ele -> ele+1).limit(6);
		Integer fact = strm.reduce(1, (a,e) -> a*e);
		System.out.println("Factorial is : "+fact);
		

	}

}
