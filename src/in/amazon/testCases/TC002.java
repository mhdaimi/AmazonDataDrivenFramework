package in.amazon.testCases;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import in.amazon.objectRepo.ObjectRepo;
import in.amazon.pageObjects.Filter;
import in.amazon.pageObjects.SearchItem;
import in.amazon.pageObjects.SearchResult;
import in.amazon.utils.Browser;
import in.amazon.utils.Excel;

public class TC002 {
	
	WebDriver driver;
	ArrayList<String> data;
	
	  @BeforeClass
	  public void beforeClass() throws Exception {
		  driver = Browser.getObject(ObjectRepo.browserName);
		  driver.get(ObjectRepo.url);
		  data =	Excel.getRowData(0, "Sheet2");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am executed after class");
	  }
	
	
  @Test
  public void Step1() throws Exception {
	  SearchItem.search(driver, data.get(0));
  }
  
  @Test
  public void Step2() throws Exception {
	  Filter.byDepartment(driver, data.get(1));
	  Filter.byPriceRange(driver, data.get(2), data.get(3));
	  Filter.sortBy(driver, data.get(4));
  }
  
  @Test
  public void Step3() throws Exception {
	  SearchResult.selectItem(driver, "1");
  }
}
