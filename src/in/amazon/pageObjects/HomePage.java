package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void clickSignIn(WebDriver driver) {
		driver.findElement(By.linkText("Sign in")).click();
	}
	
	
}
