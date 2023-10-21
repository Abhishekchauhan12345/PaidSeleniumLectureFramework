package testng;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void tc2() {
		driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("8527911580");
		driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);
		
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
