package java_Training;

public class abtractTest_class extends abstract_example {
	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract example 1");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract example 2");
		
	}
	
	
	
	public static void main(String[] args) {
		
		abstract_example at = new abtractTest_class();
		at.method1();
		at.method2();
		
	}

	

}
