package javaPrograms_R;

public class test1 {
	
	
	
	
	
	public void string1()
	{
		String s= "gelklo";
		char[] ca = s.toCharArray();
		String rev ="";
		for(int i=ca.length-1;i>=0;i--)
		{
			rev = rev+ca[i];
		}
		System.out.println(rev);
		
	}
	
	public void star()
	{
		int row=0,col=0;
		int lines =5;
		for(row=0;row<lines;row++) {
			for(col=0;col<=row;col++)
			{
				System.out.print( "*" );
			}
			System.out.println();
		}
		
	}
	//p void swap
	
	public static  void main(String[] args)
	{
		test1 t = new  test1();
		t.string1();
		t.star();
	}

}
