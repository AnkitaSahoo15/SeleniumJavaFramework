package learning;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class TestNGIgnore {
	
	
	@Test
	@Ignore
	public void test1() {
		System.out.println("I am inside test1...");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test2...");
	}

}
