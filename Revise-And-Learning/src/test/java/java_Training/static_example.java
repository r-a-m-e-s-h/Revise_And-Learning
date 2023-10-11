package java_Training;

public class static_example {
	
	static {
		
		System.out.println("Im inside a static block");
		
	}
	
	public static void method1()
	{
		System.out.println("im static method1");
	}
	public void method2()
	{
		method1();
		System.out.println("This normal method and callig static method");
	}
	
	public static void main(String[] args) {
		
		method1();
		
		System.out.println("hello world");
		
		
		static_example se = new static_example();
		se.method2();
	}
	
	

}
