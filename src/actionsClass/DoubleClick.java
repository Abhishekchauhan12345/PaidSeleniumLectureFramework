package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement course = driver.findElement(By.linkText("COURSE"));
		
		Actions a= new Actions(driver);
		a.moveToElement(course).perform();
		driver.findElement(By.linkText("Selenium")).click();
		WebElement docubleclick = driver.findElement(By.xpath("//i[contains(@class,'fa fa-plus')]"));
		Thread.sleep(3000);
		a.doubleClick(docubleclick).perform();
		
		

	}

}
