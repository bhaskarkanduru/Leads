package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

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
		driver.findElementById("createLeadForm_companyName").sendKeys("HCL");
		driver.findElementById("createLeadForm_firstName").sendKeys("Bhargavi");
		driver.findElementById("createLeadForm_lastName").sendKeys("Kanduru");
		
		WebElement dd1 = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(dd1);
		int size = dropdown.getOptions().size();
		System.out.println(size);
		dropdown.selectByIndex(size-1);
		
		WebElement dd2 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown2 = new Select(dd2);
		dropdown2.selectByVisibleText("Car and Driver");
			
		// driver.findElementByClassName("smallSubmit").click();
		// String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		// System.out.println(companyname);
		// String title = driver.getTitle();
		// System.out.println(title);
		//driver.close();


	}

}
 