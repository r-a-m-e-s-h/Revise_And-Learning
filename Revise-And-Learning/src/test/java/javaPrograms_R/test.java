package javaPrograms_R;

import org.testng.annotations.Test;

public class test {
	
	
	
	
	@Test
	public void test()
	{
		
		String s = "Hello";
		String rev="";
		char[] ca = s.toCharArray();
		for(int i=ca.length-1;i>=0;i--)
		{
			rev = rev+ca[i];
		}
		System.out.println(rev);
		
		
		int a=10,b=20;
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("a is :"+a+"\n b is :"+b);
		
		int t=0;
		int junior=100;
		int senior=200;
		t=junior;
		junior=senior;
		t=junior;
		System.out.println("Juniors pay is :"+junior); 
		
		int number =12345;
		int reverse=0;
		while(number!=0)
		{
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;
		}
		System.out.println("The reverse of a number is : "+reverse);
		
		
		int col,row=0;
		int lines=5;
		for(row=0;row<lines;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		int start=1;
		int limit=5;
		int col1,row1;
		
		for(row1=0;row1<limit;row1++)
		{
			for(col1=0;col1<=row1;col1++)
			{
				
				System.out.print( start );
				start=start+1;
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		
	}

}
