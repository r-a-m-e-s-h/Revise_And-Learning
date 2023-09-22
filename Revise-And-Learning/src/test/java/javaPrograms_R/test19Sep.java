package javaPrograms_R;

import org.testng.annotations.Test;

public class test19Sep {
	
	@Test
	public void test()
	{
		//String reverse
		
		String s = "helllo";
		
		char[] c = s.toCharArray();
		
		String rev ="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev = rev+ c[i];
			
		}
		System.out.println(rev);
		
		int first=10, second=20;
		
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println(first);
		System.out.println(second);
		
		int temp;
		int mysalary =20, senior_salary=30;
		
		temp=mysalary;
		mysalary=senior_salary;
		senior_salary=temp;
		System.out.println(mysalary);
		
		
		int row=0;
		int col=0;
		
		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		int start=0;
		int limit=5;
		for(row=0;row<limit;row++)
		{
			for(col=0;col<row;col++)
			{
				start=start+1;
				System.out.print(" "+start);
			}
			System.out.println();
		}
		
		String txt ="hello hrllllllllllllll";
		char[] c1 = txt.toCharArray();
		
		String reverse ="";
		
		for(int i1=c1.length-1;i1>0;i1--)
		{
			reverse=reverse+c1[i1];
		}
		System.err.println(reverse);
		
				
		
		
		
		
		
		
		
		
	}

}
