package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject 
{

public WebDriver driver;
	
	private By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	////select[@name='CompanyEmployees']
	
	
	
	public SignupPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver= driver2;
	}
	public WebElement enterFirstname()
	{
		return driver.findElement(firstname);
	}
	public WebElement enterLastname()
	{
		return driver.findElement(lastname);
	}
	public WebElement selectemployee()
	{
		return driver.findElement(employees);
	}
}
