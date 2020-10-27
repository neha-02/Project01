import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class ProjectDriver {
	
	public static Properties getPropertyObject() throws IOException {
		
		File propFile = new File("config\\commons.properties");
		
		FileInputStream inputProp = new FileInputStream(propFile);
		
		Properties prop = new Properties();
		
		prop.load(inputProp);

		return prop;
			
	}
	
	
	
	public static WebDriver launchBrowser() throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
	/*	File propFile = new File("config\\commons.properties");
		
		FileInputStream inputProp = new FileInputStream(propFile);
		
		Properties prop = new Properties();
		
		prop.load(inputProp);
*/
		Properties prop = getPropertyObject();
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("browser");
		
		System.out.println("url " + url);				
		System.out.println("browserName " + browser);
		
		if(browser.equals("chrome")) {
			
			ChromeOptions options = new ChromeOptions();
			options.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");			
			System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver85\\chromedriver.exe");
						
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
		
		return driver;
		
	}

}
