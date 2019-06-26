package week2.Assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver() ;
		// Step 2: Passing the URL
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//Step 3: Find and Enter User name and Password
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Step 4: Click on Login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Step 5: Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		// Click on Create Lead
		driver.findElementByXPath("//a[text()='Create Lead']").click(); ;
		
		// Enter Company name
		driver.findElementByClassName("inputBox").sendKeys("CTS");
		// Enter first name and Last name
		driver.findElementById("createLeadForm_firstName").sendKeys("Naveen");
		driver.findElementById("createLeadForm_lastName").sendKeys("S");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Naveen");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("S");
		
		// Enter Salutation and Source
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr.");
		
		WebElement drop1 = driver.findElementById("createLeadForm_dataSourceId") ;
		Select dropdown1 = new Select(drop1) ;
		dropdown1.selectByIndex(3);
		
		driver.findElementByXPath("//input[@id ='createLeadForm_generalProfTitle']") ;
		// Enter Annual revenue and Title
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Buddy");
	
		driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("2500000");
		
		// Choose Industry and Ownership
		
		WebElement drop2 = driver.findElementById("createLeadForm_industryEnumId");		
		Select dropdown2 = new Select(drop2) ;
		dropdown2.selectByValue("IND_HEALTH_CARE");

		WebElement drop3 = driver.findElementByXPath("//select[@name='ownershipEnumId']");
		Select dropdown3 = new Select(drop3) ;
		dropdown3.selectByVisibleText("S-Corporation");
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("123321");
		driver.findElementById("createLeadForm_description").sendKeys("Description needs to be entered");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important Note");
		
		driver.findElementByXPath("//span[text() ='Country Code']/following::input").sendKeys("3");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("34");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("+91");
		
		// Enter department and Choose Preferred currency
		driver.findElementByName("departmentName").sendKeys("Mechanical");
		
		WebElement drop4 = driver.findElementById("createLeadForm_currencyUomId");
		Select dropdown4 = new Select(drop4) ;
		dropdown4.selectByVisibleText("INR - Indian Rupee");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("21");
		driver.findElementByName("tickerSymbol").sendKeys("Symbol");
		
		driver.findElementByName("primaryPhoneAskForName").sendKeys("Tom");
		driver.findElementByName("primaryWebUrl").sendKeys("URLgoogle");
		
		driver.findElementById("createLeadForm_generalToName").sendKeys("Naveen");
		driver.findElementByName("generalAddress1").sendKeys("Address line 1") ;
		driver.findElementByName("generalAddress2").sendKeys("Address line 2") ;
		
		driver.findElementByName("generalCity").sendKeys("Chennai");
				
		WebElement drop6 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dropdown6 = new Select(drop6) ;
		dropdown6.selectByVisibleText("United States");
		Thread.sleep(3000);
		WebElement drop5 = driver.findElementByName("generalStateProvinceGeoId");
		Select dropdown5 = new Select(drop5) ;
		dropdown5.selectByVisibleText("Kansas");
		
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("21652");
		driver.findElementByName("generalPostalCodeExt").sendKeys("542");
		
		// Choose marketing campaign
		WebElement drop7 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropdown7 = new Select(drop7) ;
		dropdown7.selectByIndex(3);
		
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("423252727");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("Abcd12@gmail.com");
		
		driver.findElementByName("submitButton").click();
		
		String First = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if(First.equals("Naveen")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		driver.close();
	}

}
