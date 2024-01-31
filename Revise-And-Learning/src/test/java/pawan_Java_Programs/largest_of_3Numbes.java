package pawan_Java_Programs;

import java.util.Scanner;

public class largest_of_3Numbes {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter first number : ");
		int a = scanner.nextInt();
		
		System.out.println("enter second number : ");
		int b = scanner.nextInt();
		
		 System.out.println("enter 3rd number : ");
		 int c = scanner.nextInt();
		
		
		/*if(a>b && a>c)
		{
			System.out.println("a is largest : "+a);
		}
		else if (b>c && b>a)
		{
			System.out.println("b is largest : "+b);
		}
		else if (c>a && c>b )
		{
			System.out.println("c is largest : "+c);
		}
		else
		{
			System.out.println("not comparable");
		}*/
		
		/*
		 * int largest = a>b?a:b;
		 * 
		 * System.out.println(" The Largest is : "+largest);
		 */
		
		// using ternary operator
		 
		 int largest = a>b?a:b;
		  largest = c > largest ? c:largest;
		
		System.out.println(" The Largest is : "+largest);
		
		int largest2 = c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(" The lrgest is : "+largest2);
		
		
		int first=10;
		int second=30;
		
		int third = first>second?first:second;
		
		
		System.out.println(third);
		
	}

}
