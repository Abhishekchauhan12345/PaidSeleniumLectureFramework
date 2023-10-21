package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameAndBackToMainPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//switching to frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		
		//switching back from frame to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Ad To Wishlist']")).click();
		
		driver.close();
		
		

	}

}
