package pawan_Java_Programs;

public class print_even_and_odd_number_in_Array {
	
	
	public static void main(String[] args) {
		
		
		int a[] = {1,3,4,56,7,9};
		
		System.out.println(" even numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				
			}
			
		}
		
		System.out.println("Odd numbers are : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}

}
