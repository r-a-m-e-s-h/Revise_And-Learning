package pawan_Java_Programs;

public class maximum_and_minimum_element_in_array {
	
	
	public static void main(String[] args) {
		
		
		int a[]= {1,33,44,55,100};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			
		}
		System.out.println(" The maximum element is : "+max);
		
		int smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("The smallest element is : "+smallest);
		
		
	}

}
