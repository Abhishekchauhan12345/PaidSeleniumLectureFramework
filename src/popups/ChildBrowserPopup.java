package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChildBrowserPopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		driver.switchTo();
		
		
	}

}
