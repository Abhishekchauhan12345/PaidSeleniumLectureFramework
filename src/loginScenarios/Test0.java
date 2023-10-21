package loginScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is displayed");
		}
		else {
			System.out.println("Fail:home page is not displayed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		
	}

}
