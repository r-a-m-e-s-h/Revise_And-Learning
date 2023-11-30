package javaPrograms_R;

import java.util.Arrays;

public class second_largest_element {
	
	public static void main(String[] args) {
		
		
		int[] array= {1,2,3,45,77,0};
		int size=array.length;
		
		Arrays.sort(array);
		
		int second_largest = array[size-2];
		
		System.out.println("The second largest number is :"+second_largest);
		
		
	}
	
	
	

}
