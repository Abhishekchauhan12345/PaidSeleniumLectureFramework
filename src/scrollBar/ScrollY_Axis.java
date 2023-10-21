package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollY_Axis {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//typeCasting
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		// scroll from top to down
		js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(3000);
		
		//Scroll from bottom to top
		js.executeScript("window.scrollBy(0,-6000)");
		
		
	}

}
