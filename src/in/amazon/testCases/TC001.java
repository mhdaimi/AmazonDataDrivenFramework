package in.amazon.testCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import in.amazon.objectRepo.ObjectRepo;
import in.amazon.pageObjects.Filter;
import in.amazon.pageObjects.HomePage;
import in.amazon.pageObjects.Password;
import in.amazon.pageObjects.SearchItem;
import in.amazon.pageObjects.SearchResult;
import in.amazon.pageObjects.UserName;
import in.amazon.utils.Browser;
import in.amazon.utils.Excel;

public class TC001 {
	
	WebDriver driver;
	SoftAssert sa;
	
	@BeforeMethod()
	  public void beforeMethod() throws Exception {
		driver = Browser.getObject(ObjectRepo.browserName);
		driver.get(ObjectRepo.url);
		
		sa = new SoftAssert();
	  }
	
/*	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}*/
	
	
  @Test(groups= {"smoke","regression"})
  public void laptop() throws Exception {
/*	  driver = Browser.getObject(ObjectRepo.browserName);
		driver.get(ObjectRepo.url);*/
	  ArrayList<String> list2 = Excel.getRowData(1, "Sheet1");
	  System.out.println(list2);
	  SearchItem.search(driver, list2.get(0));
	  Filter.byDepartment(driver, list2.get(1));
	  Filter.byPriceRange(driver, list2.get(2), list2.get(3));
	  Filter.sortBy(driver, list2.get(4));
	  SearchResult.selectItem(driver, "2");
	  
  }
  
  @Test(groups= {"regression"})
  public void mobile() throws Exception {
/*	  driver = Browser.getObject(ObjectRepo.browserName);
		driver.get(ObjectRepo.url);*/
	  ArrayList<String> data =	Excel.getRowData(0, "Sheet2");
	  SearchItem.search(driver, data.get(0));
	  Filter.byDepartment(driver, data.get(1));
	  Filter.byPriceRange(driver, data.get(2), data.get(3));
	  Filter.sortBy(driver, data.get(4));
	  SearchResult.selectItem(driver, "1");
  }
}
