package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackDashboardPageFactory {
	// to access any method from this class
	// object with driver arg of this class need to be created
	// in testcases class

	WebDriver driver;

	public VytrackDashboardPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	// basic 3 objects in the Login page	
	@FindBy (id="user-menu")
	WebElement userMenu;
	
	@FindBy (className="fa-share-square")
	WebElement shortCuts;
	
	public WebElement UserMenu() {
		return userMenu;// returning username element
	}

	public WebElement ShortCuts() {
		return shortCuts;// returning username element
	}

}
