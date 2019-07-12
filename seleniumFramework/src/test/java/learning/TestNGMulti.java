package learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMulti {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");
	
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		System.out.println("The browser is: "+browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("projectPath : "+projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",projectPath+"drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
	}
	
	@Test
	public void test1() throws InterruptedException{
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test completed successfully..!!");
		
	}

}
