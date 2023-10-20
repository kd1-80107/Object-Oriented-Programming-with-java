public class MainCheck {

	public static void main(String[] args) 
	{
		Integer [] arr = {44, 77, 99, 22, 55, 66};
		Integer key = 50;
		int cnt = countIf(arr, key, (x,y)-> x > y);
		System.out.println("Count = " + cnt); // 4
		
		Double [] arr1 = {1.1,2.2,1.1,3.3,5.9,5.4};
		Double key1 = 1.1;
		int cnt1 = countIf(arr1,key1,(e,k) -> e.equals(key1));
		System.out.println("Count = " + cnt1);
		
		

	}
	
	static <T> int countIf(T[] arr, T key, Check<T> c) 
	 {
		int count = 0;
		 for (T t : arr) 
		 {
			 if(c.compare(t, key))
				 count++;
				 }
				 return count;
		 }
	 

}
