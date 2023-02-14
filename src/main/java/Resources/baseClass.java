package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseClass 
{	
	public WebDriver driver;
	public Properties prop;
	public void driverInitialization() throws IOException
	{
		
		
		FileInputStream fis= new FileInputStream("C:\\Users\\office\\eclipse-workspace\\SeleniumTestng16thNov\\src\\main\\java\\Resources\\data.properties");
		
		prop = new Properties();
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\office\\Downloads\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			//firefox
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			//edge
		}
		else
		{
			System.out.println("choose correct browser");
		}
			
		
	}
	@BeforeMethod
	public void openurl() throws IOException
	{
		driverInitialization();
		String urlname= prop.getProperty("url");
		 driver.get(urlname);
		
	}


	@AfterMethod
	public void closebrowser() throws IOException
	{
		driver.quit();
	}

}
