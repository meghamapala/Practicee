import org.junit.Test;

import com.bit.configureBrowser.BaseTest;

import pages.HomePage;
import pages.JeansPage;
import pages.MenPage;
import pages.ShirtPage;

public class CEndToEndScenario extends BaseTest {
	
	HomePage homePage;
	MenPage menpage;
	JeansPage jeanpage;
	ShirtPage shirtPage;
	
	@Test
	public void buyASkinnyJeans() {
		homePage=new HomePage(driver);
		homePage.clickCancelButtonFromBanner();
		menpage=homePage.clickMenMenu();
		jeanpage=menpage.clickJeansCatagory();
		jeanpage.clickskinnyJeans();
	}
	
	@Test
	public void buyAShirts() {
		homePage=new HomePage(driver);
		homePage.clickCancelButtonFromBanner();
		menpage=homePage.clickMenMenu();
		shirtPage=menpage.clickShirtCatagory();
		shirtPage.clickskinnyJeans();
		}

    }
