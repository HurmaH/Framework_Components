package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPageFactory {
	// to access any method from this class
	// object with driver arg of this class need to be created
	// in testcases class

	WebDriver driver;

	public VytrackLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	// basic 3 objects in the Login page	
	@FindBy (id="prependedInput")
	WebElement username;
	
	@FindBy (id="prependedInput2")
	WebElement password;
	
	@FindBy (id="_submit")
	WebElement loginB;
	

	public WebElement emailId() {
		return username;// returning username element
	}

	public WebElement passId() {
		return password;// returning username element
	}

	public WebElement logIn() {
		return loginB;// returning username element
	}

}
