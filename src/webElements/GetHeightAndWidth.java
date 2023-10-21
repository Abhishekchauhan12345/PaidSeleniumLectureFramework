package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidth {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement loc = driver.findElement(By.id("APjFqb"));
		Dimension hw = loc.getSize();
		System.out.println(hw.getHeight() + "height of the element");
		System.out.println(hw.getWidth() + "widht of the element");
		driver.close();

	}

}
