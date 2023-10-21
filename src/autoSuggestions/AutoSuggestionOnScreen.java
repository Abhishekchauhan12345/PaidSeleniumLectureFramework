package autoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionOnScreen {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("APjFqb"));
		ele.sendKeys("seleni");
		
		Thread.sleep(5000);
		List<WebElement> element = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(element.size());
		
		for(WebElement b:element) {
			System.out.println(b.getText());
		}
		driver.close();
		

	}

}
