package leads;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ProjectBase;

public class CreateLead extends ProjectBase{

	@BeforeTest
	public void setDta() 
	{
	excelFileName = "TC001_CreateLead";
	}
	
	
	//@Test(invocationCount =2) 
	//@Test(dataProvider = "fetchData")
	@Test(dataProvider = "sendData")
	public void runCreateLead(String cn, String fn, String ln) throws InterruptedException {
		
	
		// launchApp();
		
		// Click on Create Lead
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		
		// Enter Company name
		driver.findElementByClassName("inputBox").sendKeys(cn);
		// Enter first name and Last name
		driver.findElementById("createLeadForm_firstName").sendKeys(fn);
		driver.findElementById("createLeadForm_lastName").sendKeys(ln);
		
		/* driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Naveen");
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
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("Abcd12@gmail.com"); */
		
		driver.findElementByName("submitButton").click();
		
		/*String First = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		if(First.equals("Naveen")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}*/
		
	   } 
	
	//@DataProvider (name = "fetchData")
	
	/* @DataProvider
	public String[][] sendData()
	
	{
		String [][] data = new String[2][3];
		
		data[0][0] = "Capgemini";
		data[0][1] = "Bhaskar";
		data[0][2] = "Kanduru";
		
		data[1][0] = "Infosys";
		data[1][1] = "Anil";
		data[1][2] = "Kumar";
		return data;
	} */

}
