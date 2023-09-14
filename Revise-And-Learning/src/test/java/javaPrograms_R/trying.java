package javaPrograms_R;

public class trying {
	
	public void printNumber()
	{
		int startNum=1;
		int limit=5;
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
	
	public void PrintStar()
	{
		int row,col=0;
		int lines=5;
		for(row=0;row<lines;row++)
		{
			for(col=0;col<=row;col++)
			{
				System.out.print( " * ");
				
			}
			System.out.println();
		}
	}
	
	public void numberReverse()
	{
		int givenNumber=1234;
		int rev=0;
		
		while(givenNumber!=0)
		{
			rev=rev*10;
			rev=rev+givenNumber%10;
			givenNumber=givenNumber/10;
		}
		System.out.println(" The rev number is : "+rev);
	}
	
	public static void main(String[] args)
	{
		trying t = new trying();
		t.printNumber();
		t.PrintStar();
		t.numberReverse();
	
	}

}
