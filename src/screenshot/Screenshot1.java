package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//step1 type casting
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		// step2 we can access the method and photo will stored in RAM
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		//step3 location where screenshot is stored
		File dest= new File("./photo/amazon.png");
		
		// step 4 copy screenshot from ram to photo folder location
		FileUtils.copyFile(ram, dest);
		
		driver.close();
		

	}

}
