package seleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	static WebDriver driver = null;

	public static void main(String[] args) {

		String projectPath = System.getProperty("user.dir");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("ignoreProtectedModeSettings", true);
		
		System.out.println("projectPath : "+projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver",projectPath+"drivers\\iedriver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(cap);
		//driver = new ChromeDriver();

		driver.get("https://www.google.com");
		//enter text in search textbox
		WebElement textBox = driver.findElement(By.name("q"));
		textBox.sendKeys("kugleblitz");

		//click on search button
		WebElement button = driver.findElement(By.name("q"));
		button.sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();


	}

}
