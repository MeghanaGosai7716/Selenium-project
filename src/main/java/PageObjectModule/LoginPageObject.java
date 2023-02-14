package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By login = By.xpath("//input[@id='Login']");
	private By tryforfree = By.xpath("//a[@id='signup_link']");
	
	public LoginPageObject(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		this.driver= driver2;
	}
	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}

	public WebElement Clickonlogin()
	{
		return driver.findElement(login);
	}
	public WebElement Clickontryforfree()
	{
		return driver.findElement(tryforfree);
		
	}

}
