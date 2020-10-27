import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver=null;
	
	Test1() throws IOException{
		
		driver = ProjectDriver.launchBrowser();
	}
	
	@Test(priority=0)
	public void LaunchBrowser() throws IOException {
		
		Properties prop = ProjectDriver.getPropertyObject();
		String url = prop.getProperty("url");
		//String url = prop.getProperty("browser");
		driver.get(url);
		System.out.println("URL" + url);
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("q")).submit();
		
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=1)
	public void TestUI1(){
			
		
		WebElement multiDropDown = driver.findElement(By.xpath("//Select[@id='multiselect1']"));
		Select select = new Select(multiDropDown);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Hyundai");
				
		driver.quit();
		
		
	}

}
