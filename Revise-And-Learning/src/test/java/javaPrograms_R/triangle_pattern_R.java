package javaPrograms_R;

import java.util.Scanner;

public class triangle_pattern_R {
	
	public void PrintStarrt()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of Lines : ");
		int lines = scanner.nextInt();
		
		int row,col=0;
		
		
		for(row=0;row<lines;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	
	public void printNumber()
	{
		int startNum =1;
		int limit =5;
		int row,col;
		for(row=0;row<=limit;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print(startNum);
				startNum=startNum+1;
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		triangle_pattern_R rr = new triangle_pattern_R();
		//rr.PrintStarrt();
		rr.printNumber();
		
	}

}
