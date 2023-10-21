package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_com {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']")).click();
		
		//switch the control to frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("8527911580");
		driver.findElement(By.id("close-pop")).click();
		
		// switching back to main screen from frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("phone");
		//driver.close();
	}

}
