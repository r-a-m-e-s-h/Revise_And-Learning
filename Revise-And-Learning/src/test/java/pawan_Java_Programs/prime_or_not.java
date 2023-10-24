package pawan_Java_Programs;

public class prime_or_not {
	
	public static void main(String[] args) {
		
		
		int num =3;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)//i
			{
				if(num%i==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not a prime number");
			}
		}
		else
		{
			System.out.println("enter number greater than 1");
		}
		
		
		
		
		
	}

}
