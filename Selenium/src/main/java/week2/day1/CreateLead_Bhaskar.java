package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead_Bhaskar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CSC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Koti");
		driver.findElementById("createLeadForm_lastName").sendKeys("Eshwar");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Badri");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Nath");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Brother");
		

		WebElement dd1 = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(dd1);
		int size = dropdown.getOptions().size();
		System.out.println(size);
		dropdown.selectByIndex(size-1);

		WebElement dd2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByVisibleText("Car and Driver");
		
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr.");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50k");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select  ddIndustry = new Select(industry);
		//ddIndustry.selectByVisibleText("Media");
		ddIndustry.selectByVisibleText("Computer Software");
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select  ddOwnership = new Select(ownership);
		//ddOwnership.selectByVisibleText("Partnership");
		ddOwnership.selectByValue("OWN_PARTNERSHIP");
		
		
		driver.findElementByName("sicCode").sendKeys("B7637");
	    driver.findElementById("createLeadForm_description").sendKeys("Creating New Lead for the first time");
	    driver.findElementById("createLeadForm_importantNote").sendKeys("Important note when  creating a lead");
		driver.findElementByXPath("(//input[@name='primaryPhoneCountryCode'])[4]").sendKeys("91");
		driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("6435566");
		driver.findElementByXPath("(//span[text()='Area Code']/following::input)[1]").sendKeys("917");
		driver.findElementByXPath("//span[@id='ext-gen626']/following::input[1]").sendKeys("1234");
		
		

		// driver.findElementByClassName("smallSubmit").click();
		// String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		// System.out.println(companyname);
		// String title = driver.getTitle();
		// System.out.println(title);
		//driver.close();
	}

}
