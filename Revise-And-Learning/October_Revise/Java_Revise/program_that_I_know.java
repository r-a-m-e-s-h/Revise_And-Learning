package Java_Revise;

import org.testng.annotations.Test;

public class program_that_I_know {
	@Test(enabled=false)
	public void test_StringReverse()
	{

		String txt = "Hello Tom ";
		String rev = "";

		char[] c= txt.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);

		StringBuffer buffer = new StringBuffer("Tom and Jerry");


		System.out.println("In built buffer method : "+ buffer.reverse());


	}

	@Test(enabled=false)
	public void numberReverse()
	{

		int givenNum = 1234567890;
		int rev=0;

		while(givenNum!=0)
		{
			rev=rev*10;
			rev=rev+givenNum%10;
			givenNum=givenNum/10;
		}
		System.out.println("The reversed number is : "+rev);
	}

	@Test(enabled=false)
	public void swapwithTemp()
	{
		int a =11;
		int b= 30;
		int temp;

		temp=a;
		a=b;
		b=temp;
		System.out.println("Reverse using temp is : "+a+b);
	}
	@Test(enabled=false)
	public void SWapwithOuttemp()
	{
		int mySalary =20000;
		int SeniorSalary=50000;

		mySalary = mySalary- SeniorSalary;
		SeniorSalary = mySalary+SeniorSalary;
		mySalary = SeniorSalary - mySalary;

		System.out.println(mySalary);
		System.out.println(SeniorSalary);

	}

	@Test(enabled=false)
	public void traingelPrint()
	{
		int col,row=0;
		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}

		int start=0;

		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				start=start+1;
				System.out.print(start);
			}
			System.out.println();
		}


	}

	@Test(enabled=false)
	public void test_ArraycontainsElement()
	{

		int[] array = {1,2,3,4,5};
		int numbertoFind =4;

		for(int find : array)
		{
			if(find==numbertoFind)
			{
				System.out.println("The is found : "+find);
				break;
			}
		}	
	}

	@Test
	public void test_LetterOccurance()
	{

		String txt = "tom and jerrrrrrrrrrrrrrrrrrrrrry";

		char tofind = 'r';
		
		int occurance =0;

		for (int i=0;i<txt.length();i++) 
		{
			if(txt.charAt(i)==tofind)
			{
				occurance=occurance+1;
			}

		}
		System.out.println("The occurance of letter is : "+occurance);

	}
	
	



	/*
	 * private static void name() { program_that_I_know rb = new
	 * program_that_I_know(); rb.test_StringReverse();
	 * 
	 * 
	 * }
	 */
}
