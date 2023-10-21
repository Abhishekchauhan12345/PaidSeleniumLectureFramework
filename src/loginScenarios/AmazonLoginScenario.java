package loginScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLoginScenario {

	public static void main(String[] args){
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&prevRID=H4XR7AP6XA9FF4G2G11B&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Abhishek");
		
		driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("ap_password")).sendKeys("Power@10");
		
		driver.findElement(By.id("ap_password_check")).sendKeys("Power@10");
		
		driver.findElement(By.id("continue")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(title.equals("Amazon Registration")) {
			System.out.println("Pass:home page is displayed");
		}
		else {
			System.out.println("Fail:home page is not displayed");
		}
		driver.close();

	}

}
