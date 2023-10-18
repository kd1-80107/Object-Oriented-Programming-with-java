package Assignment;

import java.util.Arrays;
import java.util.Comparator;

public class Array {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) 
		{
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	
		}
		}
		}
		}
	
	public static void main(String[] args)
	{
		Double arr[] = new Double[6];
		
		arr[0] = 22.56;
		arr[1] = 66.50;
		arr[2] = 14.80;
		arr[3] = 16.44;
		arr[4] = 44.65;
		arr[5] = 21.43;
		
		DoubleComparable doublesortcomparator = new DoubleComparable();
		Arrays.sort(arr,doublesortcomparator);
		
		for(double ele:arr)
		{
			System.out.println(ele);
		}
		
	}
}