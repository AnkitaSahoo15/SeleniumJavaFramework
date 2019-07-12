package learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {
	
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M1041932\\eclipse-workspace\\seleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https:google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Ankita");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
		
		System.out.println("completed...!!");
	}

}
