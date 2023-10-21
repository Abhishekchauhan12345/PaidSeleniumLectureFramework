package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tnpsc.gov.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Apply Online")).click();
		
		// switch the control to the popups
		Alert alrt = driver.switchTo().alert();
		
		System.out.println(alrt.getText());
		
		Thread.sleep(3000);
		
		//click on ok button
		alrt.accept();
		
		//click on cancel button
		//alrt.dismiss();     // if you want to perform both actions paralley you get a exception called noAlertPresentException
		
		driver.close();
	}

}
