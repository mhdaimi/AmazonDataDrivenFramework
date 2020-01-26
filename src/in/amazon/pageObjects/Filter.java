package in.amazon.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Filter {
	
	public static void byDepartment(WebDriver driver, String name) {
		
		driver.findElement(By.linkText(name)).click();
		
	}
	
	public static void byPriceRange(WebDriver driver, String lowerRange, String upperRange) {
		
		driver.findElement(By.id("low-price")).sendKeys(lowerRange);
		driver.findElement(By.id("high-price")).sendKeys(upperRange);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
/*		List<WebElement> allPrices = driver.findElements(By.xpath("//div[@id='priceRefinements']/ul/li"));
		System.out.println(allPrices.size());
		
		allPrices.get(1).click();*/
		
/*		for (WebElement priceRange : allPrices) {
			
			String value = priceRange.getText();
			System.out.println("Price: " + value);
			
			if((value.contains(lowerRange)) && (value.contains(upperRange)) ) {
				priceRange.click();
			}
			
		}*/
	}
	
	public static void sortBy(WebDriver driver, String value) {
		
		Select obj = new Select(driver.findElement(By.id("s-result-sort-select")));
		obj.selectByVisibleText(value);
	}

}
