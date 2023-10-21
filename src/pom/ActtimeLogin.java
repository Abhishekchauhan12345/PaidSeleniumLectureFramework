package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActtimeLogin {
	
  // Declaration
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbutton;
	
	
	// Initilaization
	public ActtimeLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//Utilization
	public void usernametextbox(String user) {
		usernametb.sendKeys(user);
	}
	public void passwordtextbox(String pwd) {
		passwordtb.sendKeys(pwd);
	}
	public void logginbtn() {
		loginbutton.click();
	}
	}


