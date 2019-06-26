package cretaeleadsteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps 

{
	public ChromeDriver driver;
	
	@Given("Open the Browser")
	public void openTheBrowser() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the Browser")
	public void maximiseTheBrowser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
	   
	}

	@Given("set the Timeouts")
	public void setTheTimeouts() {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
	}

	@Given("Load the URL")
	public void loadTheURL() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    driver.get("http://leaftaps.com/opentaps");
	    }

	@Given("Enter the UserName as (.*)")
	public void enterTheUserNameAs(String usrname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("username").sendKeys(usrname);

	    }

	@Given("Enter the Password as (.*)")
	public void enterThePasswordAs(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementById("password").sendKeys(pwd);
		
	    }

	@When("Click on the Login Button")
	public void clickOnTheLoginButton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElementByClassName("decorativeSubmit").click();
	    }

	@Then("Verify Login Successful")
	public void verifyLoginSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login success");
	    }

}
