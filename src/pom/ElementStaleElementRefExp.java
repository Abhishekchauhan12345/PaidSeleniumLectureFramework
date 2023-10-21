package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementStaleElementRefExp {
		
	// declaration
	     @FindBy(id="APjFqb")
		 private WebElement searchtb;
        
    //Initialization
         public ElementStaleElementRefExp( WebDriver driver){
         PageFactory.initElements(driver,this);
         }
         
    //Utilization
         public void searchtextbox(String name) {
        	 searchtb.sendKeys(name);
         }
         
         
         // this is called repository.Repository means storage place where we store the element.
		
	}


