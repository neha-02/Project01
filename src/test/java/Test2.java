import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test2 {
	
WebDriver driver=null;
	
	Test2() throws IOException, InterruptedException{
		
		driver = ProjectDriver.launchBrowser();
		System.out.println("Launcehed browser for test2");
		Thread.sleep(5000);
	}
	
	@Test
	public void TestUI2(){
		//WebDriverWait wait1 = new WebDriverWait(driver,10);
		//wait1.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.tagName("a"))));
		// TODO Auto-generated method stub
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("No. of links found " + allLinks.size());
		for(int i=0;i<5;i++) {
			System.out.println(allLinks.get(i).toString());
		}
		
		driver.quit();
	}

}
