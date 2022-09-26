package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.configureBrowser.BaseTest;
import com.bit.utils.SeleniumHelper;

public class ShirtPage extends BaseTest{
	
	WebDriver driver;
	
	public ShirtPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"accordion-panel-e136\"]/div/ul/li[2]/a")
	WebElement shirtProduct;
	
	public void clickskinnyJeans() {
		SeleniumHelper.click(shirtProduct);
	}
	
	

}
