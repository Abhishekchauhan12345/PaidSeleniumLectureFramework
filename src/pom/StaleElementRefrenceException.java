package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefrenceException {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebElement ele = driver.findElement(By.id("APjFqb"));
		ElementStaleElementRefExp ele= new ElementStaleElementRefExp(driver);
		
		driver.navigate().refresh();
		
		//ele.sendKeys("selenium");
		
		ele.searchtextbox("selenium.dev");
	}

}
