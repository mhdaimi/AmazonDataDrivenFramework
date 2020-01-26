package in.amazon.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	static WebDriver driver;
	
	public static WebDriver getObject(String browserName) throws java.lang.Exception {
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\FATEEMA\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\FATEEMA\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", 
					"C:\\Users\\FATEEMA\\Downloads\\IEServerDriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new Exception("Invalid browser name");
		}
		
		return driver;
		
	}
	

}
