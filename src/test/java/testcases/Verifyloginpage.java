package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModule.LoginPageObject;
import Resources.baseClass;

public class Verifyloginpage extends baseClass {
	
	@Test
	public void login() throws IOException
	{
		//driverInitialization();
		 //driver.get("https://login.salesforce.com/?locale=in");
		 
		 //driver.findElement(By.xpath(null));
		 
		 LoginPageObject obj= new LoginPageObject(driver);
		 obj.enterUsername().sendKeys("test1");
		 obj.enterpassword().sendKeys("abc");
		 obj.Clickonlogin().click();
		 
		 
	}

}
