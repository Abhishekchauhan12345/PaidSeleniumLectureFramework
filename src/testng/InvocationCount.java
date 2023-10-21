package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority=-1)
	public void calls() {
		Reporter.log("calls", true);
	}
	
	// invocationCount and enabled functionality use here
	@Test(priority=0, invocationCount=3,enabled=false)
	public void settings() {
	Reporter.log("settings", true);
		}
		 
	@Test(priority=1)
	public void chats() {
	Reporter.log("chats", true);
			}

}
