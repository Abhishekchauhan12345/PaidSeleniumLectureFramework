package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		// back
		driver.navigate().back();
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		// refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		driver.close();

	}

}
