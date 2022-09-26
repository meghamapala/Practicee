package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bit.configureBrowser.BaseTest;
import com.bit.utils.SeleniumHelper;

public class MenPage extends BaseTest{
	
	WebDriver driver;
	
	public MenPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
    
    @FindBy(xpath="//*[@id=\"root-Men\"]/ol/li[3]/ol/li[1]/a")
    WebElement jeansCatagory;
    
    @FindBy(xpath="//*[@id=\"root-Men\"]/ol/li[3]/ol/li[2]/a") 
    WebElement shirtCatagory;
    
    public JeansPage clickJeansCatagory() {
    	SeleniumHelper.click(jeansCatagory);
    	return new JeansPage(driver);
    }
    
    public ShirtPage clickShirtCatagory() {
    	SeleniumHelper.click(shirtCatagory);
    	return new ShirtPage(driver);
    }


}
