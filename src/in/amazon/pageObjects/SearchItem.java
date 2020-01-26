package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchItem {
	
	
	public static void search(WebDriver driver, String item) {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		
	}

}
