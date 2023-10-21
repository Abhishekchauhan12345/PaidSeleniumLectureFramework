package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectTheValue {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropdown = driver.findElement(By.name("addresstype"));
		
		Select s =new Select(dropdown);
		
		s.selectByIndex(0);
		s.selectByValue("category.php?category=testing");
		s.selectByVisibleText("DevOps");
	}

}
