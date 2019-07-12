package learning;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority = 2)
	public void test1() {
		
		System.out.println("Iam inside test1");
		
	}
	
	@Test(priority = 0)
	public void test2() {
		System.out.println("Iam inside test2");
		
	}
	
	@Test(priority = 0)
	public void test3() {
		System.out.println("Iam inside test3");
	}
}
