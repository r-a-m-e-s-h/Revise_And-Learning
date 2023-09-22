package javaPrograms_R;

import org.testng.annotations.Test;

public class test11 {
	@Test(enabled=false)
	public void array_contains_element_or_Not()
	{
		
		int[] element = {1,2,3,4,5};
		 int numberToFInd =3;
		 
		 for(int i=0;i<element.length;i++)
		 {
			 if(element[i]==numberToFInd)
			 {
				 System.out.println("found");
				 break;
			 }
		 }
		
		
	}
	
	@Test(enabled=false)
	public void Testoccurance()
	{
		String txt ="hello worldeee";
		
		char tofound = 'e';
		
		int occurance=0;
		
		for(int i=0;i<txt.length();i++)
		{
			if(txt.charAt(i)==tofound)
			{
				occurance=occurance+1;
			}
		}
		System.out.println(occurance);
		
	}
	
	@Test
	public  void testreverse()
	{
		String txt ="hello";
		char[] c = txt.toCharArray();
		String rev ="";
		for(int i =c.length-1;i>=0;i--)
		{
			rev= rev+c[i];
		}
		System.out.println(rev);
		
		
		
	}

}

