package javaPrograms_R;

import org.testng.annotations.Test;

public class alphabet_position { 
	//small -97
	//caps -65
	@Test
	public void test1()
	{
		char givenchar = 'c';
		
		givenchar = Character.toUpperCase(givenchar);
		
		int ascival = (int)givenchar;
		
		System.out.println("The acsi val is : "+ascival);
		
		int position = ascival-64;
		System.out.println("The posistion is : "+position);
		
		
		
		
	}

}
