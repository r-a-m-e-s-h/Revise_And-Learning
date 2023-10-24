package pawan_Java_Programs;

public class sum_of_digits_in_given_number {
	
	
	
	public static void main(String[] args) {
		
		
		int number = 1234;
		
		int sum=0;
		
		while(number>0)
		{
			sum = sum+number%10; //4
			number = number/10; //123
		}
		System.out.println("The sum of digits is : "+sum);
		
		
		
	}

}
