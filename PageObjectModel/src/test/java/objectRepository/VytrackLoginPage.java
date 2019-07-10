package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackLoginPage {
	// to access any method from this class
	// object with driver arg of this class need to be created
	// in testcases class

	WebDriver driver;

	public VytrackLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// basic 3 objects in the Login page
	By username = By.id("prependedInput");
	By password = By.id("prependedInput2");
	By loginB = By.id("_submit");

	public WebElement emailId() {

		return driver.findElement(username);// returning username element
	}

	public WebElement passId() {
		return driver.findElement(password);// returning username element
	}

	public WebElement logIn() {
		return driver.findElement(loginB);// returning username element
	}

}
