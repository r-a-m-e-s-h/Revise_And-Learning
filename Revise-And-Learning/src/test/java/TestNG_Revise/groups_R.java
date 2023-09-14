package TestNG_Revise;

import org.testng.annotations.Test;

public class groups_R {

	
	@Test(groups = "level1")
	public void level1_testpractise1()
	{
		System.out.println("Phase 1");
	}
	@Test(groups= "level1")
	public void level1_testpractise2()
	{
		System.out.println("Phase 1");
	}

	@Test(groups = "level2")
	public void level2_testpractise1()
	{
		System.out.println("Phase 1");
	}
	@Test(groups= "level2")
	public void level2_testpractise2()
	{
		System.out.println("Phase 1");
	}

	@Test(groups = "level3")
	public void level3_testpractise1()
	{
		System.out.println("Phase 1");
	}
	@Test(groups= "level3")
	public void level3_testpractise2()
	{
		System.out.println("Phase 1");
	}
	
	
	
	
	
	
	
}
