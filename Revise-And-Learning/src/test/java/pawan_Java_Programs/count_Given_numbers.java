package pawan_Java_Programs;

public class count_Given_numbers {
	
	public static void main(String[] args) {
		
		int number = 123456;
		
		int count=0;
		
		while(number > 0)
		{
			number=number/10;
			count++;
		}
		
		System.out.println("The count of givne number is : "+count);
	}

}
