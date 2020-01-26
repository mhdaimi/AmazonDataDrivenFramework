package in.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult {
	
	public static void selectItem(WebDriver driver, String choice) {
		
		WebElement result = driver.findElement(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div[" + choice +"]"));
		
		result.findElement(By.tagName("a")).click();
		
	}

}
