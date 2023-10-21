package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		ActtimeLogin login= new ActtimeLogin(driver);
		login.usernametextbox("admin");
		
		login.passwordtextbox("manager");
		
		login.logginbtn();
		
	}

}
