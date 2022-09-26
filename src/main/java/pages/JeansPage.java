package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.configureBrowser.BaseTest;
import com.bit.utils.SeleniumHelper;

public class JeansPage extends BaseTest{
	
	WebDriver driver;
	
	public JeansPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"accordion-panel-9019\"]/div/ul/li[3]/a") 
	WebElement skinnyJeansOptions;
	
	public void clickskinnyJeans() {
		SeleniumHelper.click(skinnyJeansOptions);
	}

}
