package java_Training;

public class overiding_Example extends methods_class {
	
	
	public void method1()
	{
		System.out.println("im overiridng example 1");
	}
	public void method2()
	{
		System.out.println("im overiridng example 2");
	}
	
	
	
	public static void main(String[] args) {
		
		methods_class mc = new overiding_Example();
		mc.method1();
		mc.method2();
		
	}

}
