import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test03 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("DP => n -" + n + "; s -" + s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Started suite execution");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Suite execution ends");
  }

}
