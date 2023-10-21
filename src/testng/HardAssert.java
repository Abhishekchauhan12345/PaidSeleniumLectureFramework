package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HardAssert {
public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void tc1() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String title = driver.getTitle();
		
		//Assertion concept
		Assert.assertEquals(title, "434323434dsdfd");
		
		
		Reporter.log(title,true);        // line no 35,36 and 37 are right but not executed because in above there is a hard assert
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
	}
	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
