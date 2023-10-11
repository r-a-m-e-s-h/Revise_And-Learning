package javaPrograms_R;

import java.util.Arrays;

import org.testng.annotations.Test;



public class test_0ct_07 {
	
	
	@Test
	public void testreverseNumber() {
		
		int givennum =123;
		int rev=0;
		
		while(givennum!=0)
		{
			rev=rev*10;
			rev=rev+givennum%10;
			givennum=givennum/10;
		}
		System.out.println(rev);
		
		String str = "Hello";
		String rev1="";
		
		char[] c = str.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev1=rev1+c[i];
		}
		System.out.println(rev1);
		
		int first=10;
		int second=20;
		/*
		 * first=first-second; second=first+second; first=second-first;
		 * 
		 * System.out.println(second);
		 */
		
		int temp;
		
		temp= first;
		
		first=second;
		
		second=temp;
		
		System.out.println(first +" using temp "+second);
		
		
		int col,row;
		
		for(row=0;row<5;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print( "*" );
			}
			System.out.println();
		}
		int startnum=0;
		
		for(row=0;row<5;row++)
		{
			for(col=0;col<row;col++)
			{
				startnum=startnum+1;
				System.out.print(startnum);
			}
			System.out.println();
		}
		
		int a[]= {1,2,3,5,-10};
		
		int small = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			
		}
		System.out.println(small);
		
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println("2nd smallest element in array "+a[1]);
		
		
		
	}
	

}
