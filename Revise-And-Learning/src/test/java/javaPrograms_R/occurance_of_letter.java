package javaPrograms_R;

import org.testng.annotations.Test;

public class occurance_of_letter {
	@Test
	public void test1()
	{
		String t = "hello World";
		
		char tofind ='o';
		
		int occurance=0;
		
		for(int i=0;i<t.length();i++)
		{
			if(t.charAt(i)==tofind)
			{
				occurance=occurance+1;
			}
		}
		System.out.println("The occurance is : "+occurance);
		
	}

}
