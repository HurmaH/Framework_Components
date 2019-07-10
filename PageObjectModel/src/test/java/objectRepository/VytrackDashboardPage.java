package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackDashboardPage {
	// to access any method from this class
	// object with driver arg of this class need to be created
	// in testcases class

	WebDriver driver;

	public VytrackDashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// basic objects in the Dashboard page
	By userMenu = By.id("user-menu");
	By shortCuts = By.className("fa-share-square");
	
	By Dashboards = By.xpath("//span[@class='title title-level-1'][contains(text(),'Dashboards')]");
	By Fleet = By.xpath("//span[@class='title title-level-1'][contains(text(),'Fleet')]");
	By Customers = By.xpath("//span[@class='title title-level-1'][contains(text(),'Customers')]");
	By Sales = By.xpath("//span[@class='title title-level-1'][contains(text(),'Sales')]");
	By Activities = By.xpath("//span[@class='title title-level-1'][contains(text(),'Activities')]");
	By Marketing = By.xpath("//span[@class='title title-level-1'][contains(text(),'Marketing')]");
	By ReportsSegments = By.xpath("//span[@class='title title-level-1'][contains(text(),'Reports & Segments')]");
	By System = By.xpath("//span[@class='title title-level-1'][contains(text(),'System')]");
	
	public WebElement dashboards() {
		return driver.findElement(Dashboards);
	}
	
	public WebElement fleet() {
		return driver.findElement(Fleet);
	}
	
	public WebElement customers() {
		return driver.findElement(Customers);
	}
	
	public WebElement sales() {
		return driver.findElement(Sales);
	}
	
	public WebElement activities() {
		return driver.findElement(Activities);
	}
	
	public WebElement reportsSegments() {
		return driver.findElement(ReportsSegments);
	}
	
	public WebElement system() {
		return driver.findElement(System);
	}
	
		

}
