package java_Training;

public class interfaceTest_class implements interface_example {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("This is interface example1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is interface example2");
		
	}
	
	
	public static void main(String[] args) {
		
		interfaceTest_class it = new interfaceTest_class();
		it.method1();
		it.method2();
		
	}

}
