package in.amazon.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class TC004 {
	
  @Test
  public void a() {
	  System.out.println("I am test A");
	  Assert.assertEquals(2, 2);
  }
  
  @Test
  public void b() {
	  System.out.println("I am test B");
	  Assert.assertEquals(2, 3);
	  
	  
  }
  
  @Test
  public void c() {
	  System.out.println("I am test C");
	  Assert.assertEquals(2, 2);
  }
  
  @Test
  public void d() {
	  System.out.println("I am test D");
	  Assert.assertEquals(2, 2);
  }
  
}
