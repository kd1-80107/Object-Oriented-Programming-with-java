/*8. Create an IntStream to represent numbers from 1 to 10. 
Call various functions like sum(), 
summaryStatistics() and observe the output.*/

package com.Assignment_12_8;

import java.util.stream.IntStream;

public class Program {

	public static void main(String[] args) {
		
		IntStream strm1 = IntStream.range(1, 10);//1,2,3,4,5,6,7,8,9
		int total = strm1.sum();
		System.out.println(total);
		
		IntStream strm2 = IntStream.range(1, 10);
		System.out.println(strm2.summaryStatistics());
	}

}
