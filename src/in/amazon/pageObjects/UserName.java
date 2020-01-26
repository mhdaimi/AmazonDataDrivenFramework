package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserName {
	
	public static void enterUserName(WebDriver driver, String userName) {
		driver.findElement(By.id("ap_email")).sendKeys(userName);
		driver.findElement(By.id("continue")).click();
	}

}
