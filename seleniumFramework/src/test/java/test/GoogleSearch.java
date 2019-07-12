package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com");
		
		//enter text in search textbox
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("kugleblitz");
		
		//click on search button
		WebElement button = driver.findElement(By.name("q"));
		button.sendKeys(Keys.RETURN);
		
		//WebElement button = driver.findElement(By.xpath("//input[@name ='btnk']"));
		
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
		
		
		
		
	}

}
