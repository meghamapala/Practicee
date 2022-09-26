package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.configureBrowser.BaseTest;
import com.bit.utils.SeleniumHelper;

public class HomePage extends BaseTest{
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="button[aria-label='Focus Close Modal']")
	WebElement cancelButton;
	
	@FindBy(xpath="a[href='/mens-clothing']") 
	WebElement menMenu;
	
	public void clickCancelButtonFromBanner() {
		SeleniumHelper.click(cancelButton);
	}
	
	public MenPage clickMenMenu() {
		SeleniumHelper.click(menMenu);
		return new MenPage(driver);
	}

	

}
