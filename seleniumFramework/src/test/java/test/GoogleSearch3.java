package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearch3 {
	
	static WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test
	public static void googleSearch() {
		
		//goto google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("kugleblitz");
		
		//click on search button
		WebElement button = driver.findElement(By.name("q"));
		button.sendKeys(Keys.RETURN);
		
		//WebElement button = driver.findElement(By.xpath("//input[@name ='btnk']"));
			
		
	}
	
	@AfterTest
	public void tearDownTest() {
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully");
				
	}

}
