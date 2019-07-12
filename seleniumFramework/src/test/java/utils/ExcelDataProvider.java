package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver = null;
	
	@BeforeTest
	public void SetUp() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "test1")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | "+password);
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		
	}

	@DataProvider(name = "test1")
	public Object[][] getData() {
		Object data[][] = testData("C:\\Users\\M1041932\\eclipse-workspace\\seleniumFramework\\excel\\data.xlsx", "Sheet1");
		return data;

	}


	public Object[][] testData(String excelPath, String sheetName) {
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

		int rowCount = ExcelUtils.getRowCount();
		int colCount = ExcelUtils.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for(int i = 1;i < rowCount; i++) {
			for(int j = 0; j < colCount; j++) {
				String cellData = ExcelUtils.getCellDataString(i,j);
				//System.out.println(cellData);
				data[i-1][j] = cellData;
			}
			//System.out.println();

		}
		return data;


	}
}
