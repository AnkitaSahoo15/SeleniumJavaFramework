package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("Google Search Test", "This is a test to validate the google search");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test.log(Status.INFO, "Starting the test case");
		
		driver.get("https://www.google.com");
		test.pass("Navigated successfully");
		

		//enter text in search textbox
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("kugleblitz");
		test.pass("Entered text");
		
		
		//click on search button
		WebElement button = driver.findElement(By.name("q"));
		button.sendKeys(Keys.RETURN);
		test.pass("Button clicked and the search has begun");
		
		
		driver.close();
		driver.quit();
		test.pass("Browser closed");
		
		test.info("Test completed");
		extent.flush();
		
		

	}

}
