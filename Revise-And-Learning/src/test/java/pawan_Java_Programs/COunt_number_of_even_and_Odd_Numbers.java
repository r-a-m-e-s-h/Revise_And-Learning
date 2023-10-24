package pawan_Java_Programs;

public class COunt_number_of_even_and_Odd_Numbers {
	
	public static void main(String[] args) {
		
		
		
		int number = 1234567890;
		
		int remainder=0;
		
		int even_count=0;
		int odd_count=0;
		
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
			number =number/10;
			
		}
		System.out.println("The count of even number is : "+even_count);
		
		System.out.println("The count of odd number is : "+ odd_count);
		
		
		
	}

}
