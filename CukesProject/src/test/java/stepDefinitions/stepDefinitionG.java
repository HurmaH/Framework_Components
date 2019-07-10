package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinitionG {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        //throw new PendingException();
    	//code to navigate to usrl
    	System.out.println("Navigate to URL");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
      //code to login
    	System.out.println("Login successfully");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg1);
        System.out.println(arg2);
        
        //ex
        //driver.findElement(By...)).sendKeys(arg1)
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
       //home page validation
    	System.out.println("Validate home page");
    }
    
    @Then("^Cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(arg1);
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //validating cards
    	System.out.println("Validate cards");
    }
}
