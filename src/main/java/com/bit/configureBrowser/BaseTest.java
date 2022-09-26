package com.bit.configureBrowser;

import java.io.IOException;
import java.util.Properties;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.bit.utils.SeleniumHelper;

public class BaseTest {
	
	protected WebDriver driver;
	static Properties prop;
	
	@BeforeClass
	public static void configure() throws IOException {
		
		prop=SeleniumHelper.readPropertyFile(System.getProperty("user.dir")+"/Users/meghamapalagama/"
				+ "eclipse-workspace/Practicee/config.properties");
		}

	@Before
	public void openBrowser() {
		
		String browser = System.getProperty("browser");
		if(browser.equals("chrome"))
			
			
		{
			driver=new ChromeDriver();
		}
		
		driver.get(System.getProperty("url"));
	}

	@AfterClass
	public void teardown() {
		driver.close();
	}
}
