package in.amazon.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class TC003 {
	
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am executed before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("I am executed after suite");
	  }
	
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am executed before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am executed after test");
	  }
	
	
	
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("I am executed before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("I am executed after class");
	  }

	
	
  
	@Test(groups= {"smoke", "regression"})
	  public void a() {
			System.out.println("I am test a");
	  }
	
	@Test(priority=0, groups= {"regression"})
  public void f() {
		System.out.println("I am test f");
  }
  
  
  @BeforeMethod()
  public void beforeMethod() {
	  System.out.println("I am executed before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am executed after method");
  }

}
