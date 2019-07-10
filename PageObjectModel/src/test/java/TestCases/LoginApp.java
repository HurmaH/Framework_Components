package TestCases;

import javax.net.ssl.HostnameVerifier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.VytrackDashboardPage;
import objectRepository.VytrackDashboardPageFactory;
import objectRepository.VytrackLoginPage;

public class LoginApp {
  
  @Test
  public void Login() throws InterruptedException {
	 //open url
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://qa2.vytrack.com/user/login");
	 
	 //create objectpage's object to access any method in that class
	 VytrackLoginPage logD = new VytrackLoginPage(driver);//this will be assigned to local driver
	 VytrackDashboardPage dashD = new VytrackDashboardPage(driver);
	 VytrackDashboardPageFactory dashFD = new VytrackDashboardPageFactory(driver);
	 
	 //call methods to login from VytrackLoginPage
	 logD.emailId().sendKeys("salesmanager264"); //driver.findElement(By.id("prependedInput")).sendKeys("salesmanager264")
	 logD.passId().sendKeys("UserUser123");      //driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
	 logD.logIn().click(); 
	 
	 Thread.sleep(5000);
	 
	 //call methods from dashboard
	 dashD.activities().click();
	 
	 dashFD.UserMenu().click();
	

  }
}
