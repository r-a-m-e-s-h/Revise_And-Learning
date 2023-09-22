package javaPrograms_R;

import java.util.Arrays;

import org.testng.annotations.Test;

public class smallest_in_array {
	
	@Test
	public void test()
	{
		int givenarray[]= {1,3,5,6,0,-2};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<givenarray.length;i++)
		{
			if(givenarray[i]<smallest)
			{
				smallest=givenarray[i];
			}
		}
		System.out.println("the smallest values is "+smallest);
		
		
		Arrays.sort(givenarray);
		
		System.out.println("The inbuild using sort : "+givenarray[0]);
		
		System.out.println("The inbuild using sort : "+givenarray[1]);
		
	}

}
