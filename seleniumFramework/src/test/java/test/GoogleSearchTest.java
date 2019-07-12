package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
		//WebElement textBox = driver.findElement(By.name("q"));
		//textBox.sendKeys("kugleblitz");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("kugleblitz");
		
		//click on search button
		//WebElement button = driver.findElement(By.name("q"));
		//button.sendKeys(Keys.RETURN);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		//WebElement button = driver.findElement(By.xpath("//input[@name ='btnk']"));
		
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
		
		
		
		
	}

}
