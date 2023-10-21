package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddeDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[contains(@class,'desktop in')]")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//p[text()='25']")).click();
				

	}

}
