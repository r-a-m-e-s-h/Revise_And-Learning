package program_revise;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.testng.annotations.Test;

public class programs {
	
	
	@Test(enabled=false)
	public void test_reverse()
	{
		String txt ="hello world";
		String rev="";
		char[] c=txt.toCharArray();
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
	}
	
	@Test(enabled=false)
	public void number_reverse()
	{
		int num= 123;
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
	}
	@Test(enabled=false)
	public void test_swap()
	{
		int first=300;
		int second=400;
		first =first-second;
		second=first+second;
		first=second-first;
		System.out.println(second);
		
		int a=100;
		int b=500;
		int temp=0;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(b);
		
	}
	@Test(enabled=false)
	public void smallest_in_array()
	{
		int[] a= {1,2,3,466,0,-1};
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The smallest is  : "+smallest);
	}
	
	@Test(enabled=false)
	public void max()
	{
		int[] a= {1,2,3,466,0,-1};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}			
		}
		System.out.println("The maximum val is : "+max);
	}
	@Test(enabled=false)
	public void element_present_or_not()
	{
		String txt ="helllloooo world";
		char tofind= 'o';
		int count=0;
		char[] c = txt.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==tofind)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	@Test(enabled=false)
	public void count_of_given_Number()
	{
		int number =123456789;
		int count=0;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println(count);
		
	}
	@Test(enabled=false)
	public void even_odd_count()
	{
		int number = 1234567890;
		int odd_count=0;
		int even_count=0;
		
		int remainder=0;
		while(number>0)
		{
			remainder=number%10;
			if(remainder%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			number=number/10;
		}
		System.out.println(even_count);
	}
	
	@Test(enabled=false)
	public void largest_of_number()
	{
		int a=10,b=20,c=30;
		
		int largest=0;
		largest=(a>b)?a:b;
//		/* System.out.println(largest); */
		
		int largest2 = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest2);
		
	}
	@Test(enabled=false)
	public void missing_element()
	{
		int[] a= {1,4,2,5,6,7,8,9};
		
		int sum1=0,sum2=0;
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum1 is : "+sum1);
		for(int j=0;j<=9;j++)
		{
			sum2=sum2+j;
		}
		System.out.println("the range is : "+sum2);
		
		System.out.println("The missing number is  : "+(sum2-sum1));
	}
	
	@Test(enabled=false)
	public void prime_or_not()
	{
		int number =12;
		int count=0;
		
		if(number>1)
		{
		if(number%2==0)
		{
			count++;
		}
		
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime ");
		}
	}
	@Test
	public void sum_of_digits()
	{
		int number=12345;
		
		int sum=0;
		
		while(number>0)
		{
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println(sum);
	}
	
	

}
