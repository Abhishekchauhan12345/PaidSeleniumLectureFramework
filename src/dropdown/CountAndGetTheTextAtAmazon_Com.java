package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountAndGetTheTextAtAmazon_Com {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s= new Select(dropdown);
		s.selectByIndex(7);
		s.selectByValue("search-alias=fashion-girls-intl-ship");
		s.selectByVisibleText("Deals");
		
		List<WebElement> Alloptions = s.getOptions();
		
		System.out.println(Alloptions.size());
		
		for(WebElement b:Alloptions) {
			System.out.println(b.getText());
			
		}
		driver.close();
	}

}
