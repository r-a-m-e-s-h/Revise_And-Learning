package javaPrograms_R;

import java.util.Scanner;

public class reverse_a_Number_R {
	
	public void reverse_Number()
	{
		int givenNumber = 12345;
		int rev=0;
		
		while(givenNumber!=0)
		{
			rev=rev*10;
			rev=rev+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		System.out.println("The reversed number is : "+rev);
	}
	
	
	
	public void usingScanner()
	{
		int givenNumber = 0;
		int rev_num =0;
		
		System.out.println(" Enter the number : ");
		
		Scanner scanner = new Scanner(System.in);
		givenNumber = scanner.nextInt();
		
		while(givenNumber!=0)
		{
			rev_num = rev_num*10;
			rev_num=rev_num+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		System.out.println(rev_num);
	}
	
	
	public static void main(String[] args)
	{
		/*
		int givenNumber = 1234;
		int rev_num =0;
		
		while(givenNumber!=0)
		{
			rev_num = rev_num*10;
			rev_num=rev_num+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		System.out.println(rev_num);
		*/
		reverse_a_Number_R rr = new reverse_a_Number_R();
		rr.reverse_Number();
		//rr.usingScanner();
	}

}
