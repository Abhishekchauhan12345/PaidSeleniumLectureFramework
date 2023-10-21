package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// fullScreen
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.close();
		

	}

}
