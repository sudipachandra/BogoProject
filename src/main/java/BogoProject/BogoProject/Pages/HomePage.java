package BogoProject.BogoProject.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//*[@id = \"username\"]")
	private static WebElement Username;
	
	@FindBy(xpath = "//*[@id = \"password-field\"]")
	private static WebElement Password;
	
	@FindBy(xpath = "//*[@class = \"btn btn-sm btn-primary\"]")
	private static WebElement LoginButton;
	
	
	WebDriver driver = null;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
    
     
	public StatusPage login() throws InterruptedException {
		Username.sendKeys("testingbogo4321@gmail.com");
		Password.sendKeys("12345678");
		Thread.sleep(4000);
		LoginButton.click();
		List<WebElement> lt = (List<WebElement>) driver.findElements(By.tagName("a"));
	     int noOfLink = lt.size();
	     System.out.println("the no of links are : "+noOfLink);
	     for(int i= 0;i<noOfLink;i++) {
	    	 System.out.println(lt.get(i));
	     }
		return new StatusPage(driver);
	}
}
