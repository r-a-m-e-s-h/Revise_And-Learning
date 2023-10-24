package pawan_Java_Programs;

public class missing_element_in_Array {
	
	
	public static void main(String[] args) {
		
		
		int[] a = {1,2,4,5,6,7,8,9,10};
		int sum1 = 0,sum2=0;
		
		
		
		for(int i=0;i<a.length;i++)
		{
			
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in an array : "+sum1);
		
		for(int j=1;j<=10;j++)
		{
			sum2=sum2+j;
		}
		System.out.println("The range of element in an array is : "+sum2);
		
		System.out.println("The missing elelemnt is : "+(sum2-sum1));
		
		
	}

}
