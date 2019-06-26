package leads;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.ProjectBase;

public class EditLead extends ProjectBase 
{
	@Test (dependsOnMethods = {"leads.CreateLead.runCreateLead"})
	public void runEditLead () throws InterruptedException {
		
		// launchApp();
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//label[text() ='First name:'])[3]/following::input[1]").sendKeys("Naveen");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(8000);
		
		driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-firstName'])/following::tbody//td[3]//a").click();
		
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("NTT Data");
		
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText() ;
		if(text.contains("NTT Data")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
	}

}
