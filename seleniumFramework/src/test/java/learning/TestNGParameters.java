package learning;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	
	@Parameters({"MyName"})
	@Test
	public void test(@Optional("Ankita") String name) {
		System.out.println("My name is : "+name);
	}

}
