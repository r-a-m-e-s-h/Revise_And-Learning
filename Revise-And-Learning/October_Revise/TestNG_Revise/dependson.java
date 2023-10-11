package TestNG_Revise;

import org.testng.annotations.Test;

public class dependson {
	
	
	
	
	@Test
	public void test1() {
		System.out.println("i'm main test1");
	}
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("i'm a depends on test2");
	}

}
