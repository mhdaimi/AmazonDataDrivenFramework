package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Password {
	
	public static void enterPassword(WebDriver driver, String password) {
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
	}
	

}
