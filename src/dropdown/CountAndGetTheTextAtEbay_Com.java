package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountAndGetTheTextAtEbay_Com {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s= new Select(dropdown);
		s.selectByIndex(4);
		
		Thread.sleep(3000);
		s.selectByValue("625");
		Thread.sleep(3000);
		s.selectByVisibleText("Crafts");
		
		List<WebElement> Alloptions = s.getOptions();
		System.out.println(Alloptions.size());
		
		for(WebElement b:Alloptions) {
			System.out.println(b.getText());
			
		}
		driver.close();
		

	}

}
