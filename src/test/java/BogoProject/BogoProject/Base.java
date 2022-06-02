package BogoProject.BogoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	static WebDriver driver = null;
	
	@BeforeMethod
	public void startTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/sudipa/eclipse-workspace/BogoProject/drivers/chromedriver_latest");
		driver = new ChromeDriver();
		driver.get("https://restaurant.bogomazing.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void endTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
}
