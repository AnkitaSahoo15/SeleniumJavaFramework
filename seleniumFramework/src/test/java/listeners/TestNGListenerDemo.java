package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNGListenerDemo {
	
	@Test
	public void test1() {
		System.out.println("I am inside test1..!!");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test2..!!");
		
	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test3..!!");
		
	}
	
	@Test
	public void test4() {
		System.out.println("I am inside test4..!!");
	}
	

}
