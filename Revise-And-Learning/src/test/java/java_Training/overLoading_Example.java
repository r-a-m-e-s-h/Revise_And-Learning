package java_Training;

public class overLoading_Example {
	
	
	
	public void add(double d, double e)
	{
		double c = d+e;
		System.out.println("Overiridng example1 : "+c);
	}
	public void add(float a,float b)
	{
		float c = a+b;
		System.out.println("Overiridng example2 : "+c);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		overLoading_Example oe = new overLoading_Example();
		oe.add(10, 20);
		oe.add(0.511, 0.5);
		
		
	}

}
