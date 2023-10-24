package javaPrograms_R;

import java.util.Arrays;

import org.testng.annotations.Test;

public class program_test {
	
	
	//@Test
	public void reverse()
	{
		String txt = "Hello world";
		String rev="";
		char[] c =txt.toCharArray();
		
		for(int i=c.length-1;i>0;i--)
		{
			rev = rev+c[i];
		}
		System.out.println(rev);
		
		
		
		int rev1=0;
		int number=12345;
		
		while(number!=0)
		{
			rev1=rev1*10;
			rev1=rev1+number%10;
			number = number/10;
		}
		
		System.out.println(rev1);
		
		
	}
	//@Test
	public void swap()
	{
		
		int temp;
		int a=40;
		int b=90;
		
		temp=a;
		a=b;
		b=temp;
		System.out.println(b);
		System.out.println(a);
		
		int mysalary=20;
		int seniorsal=40;
		
		mysalary= mysalary-seniorsal;
		seniorsal = mysalary+seniorsal;
		mysalary = seniorsal - mysalary;
		System.out.println(mysalary);
		
		
		
	}
	//@Test
	public void smallestInArray()
	{
		int[] a = {1,2,3,4,5,6};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The smallest value is :"+smallest);
		Arrays.sort(a);
		System.out.println(a[1]);
		
		
	}
	
	@Test
	public void findTest()
	{
		String txt = "helloeeeeeeeeeeeeeee";
		
		char tofind ='e';
		
		int count=0;
		
		for(int i=0;i<txt.length();i++)
		{
			if(txt.charAt(i)==tofind)
			{
				count++;
			}
		}
		System.out.println(count);
	
	}
	
	
	
	
	
	

}
