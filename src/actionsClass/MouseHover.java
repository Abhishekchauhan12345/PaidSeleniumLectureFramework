package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement shop = driver.findElement(By.xpath("//button[contains(@class,'drawerbtn')]"));
		
		Actions a=new Actions(driver);
		
		a.moveToElement(shop).perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Shoes")).click();
		
		driver.close();

	}

}
