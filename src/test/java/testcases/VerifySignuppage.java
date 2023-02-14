package testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModule.LoginPageObject;
import PageObjectModule.SignupPageObject;
import Resources.baseClass;

public class VerifySignuppage extends baseClass{

	@Test
	public void signup() throws IOException, InterruptedException
	{
		//driverInitialization();
		 //driver.get("https://login.salesforce.com/");
		
		 LoginPageObject lpo = new LoginPageObject(driver);
		 lpo.Clickontryforfree().click();
		
		 SignupPageObject spo = new SignupPageObject(driver);
		 Thread.sleep(6000);
		 spo.enterFirstname().sendKeys("meghana");
		 
		 Select s= new Select(spo.selectemployee());
		 s.selectByIndex(1);
	}
}
