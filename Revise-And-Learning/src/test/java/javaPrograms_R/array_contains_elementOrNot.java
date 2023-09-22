package javaPrograms_R;

import org.testng.annotations.Test;

public class array_contains_elementOrNot {
	
	
	@Test
	public void test()
	{
		int[] array = {1,2,3,4,11,22,44};
		int numberToFind =3;
		
		for(int iterator : array)
		{
			if(numberToFind==iterator)
			{
				System.out.println("number found");
				break;
			}
			
		}
		
	}

}
