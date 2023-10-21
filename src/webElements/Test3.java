package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		Thread.sleep(5000);
		ele.sendKeys("admin");
		WebElement ele1 = driver.findElement(By.id("password"));
		ele1.clear();
		Thread.sleep(5000);
		ele1.sendKeys("admin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.close();
		

	}

}
