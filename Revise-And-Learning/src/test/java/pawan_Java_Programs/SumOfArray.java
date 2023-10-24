package pawan_Java_Programs;

public class SumOfArray {
	
	
	public static void main(String[] args) {
		
		
		int[] a= {1,2,3,47};
		
		int sum=0,sum2=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of element in an array is : "+sum);
		
		for(int value : a)
		{
			sum2=sum2+value;
			
		}
		System.out.println("The sum of element in an array is : "+sum2);
	}

}
