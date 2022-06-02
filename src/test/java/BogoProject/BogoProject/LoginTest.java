package BogoProject.BogoProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BogoProject.BogoProject.Pages.HomePage;

public class LoginTest extends Base{
	
	@Test
	public void loginTesting() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.login();
		String pageTitle = driver.getTitle();
		System.out.println("The title of status page is :"+pageTitle);
		String titleOfBogoStatusPage = "BOGOmazing";
		Assert.assertEquals(pageTitle, titleOfBogoStatusPage,"We reach at status page of BOGO");
		Thread.sleep(3000);
		driver.navigate().back();
		
	}
}