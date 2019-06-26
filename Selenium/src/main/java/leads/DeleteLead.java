package leads;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utils.ProjectBase;

public class DeleteLead extends ProjectBase {
@Test 
	public  void runDeleteLead() throws InterruptedException {
		
		
		driver.findElementByXPath("//a[text()='Leads']").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[2]").click();
				
		driver.findElementByXPath("(//label[text() ='Phone Number:'])[4]/following::input[3]").sendKeys("423252727");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(8000);
		
		String text = driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").getText();
		System.out.println(text);
		
		driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").click();
		
		driver.findElementByXPath("//a[text()='Delete']").click();
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("(//label[text() ='Lead ID:'])/following::input[1]").sendKeys(text);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		
		String ErrorMsg = driver.findElementByXPath("//div[@class='x-paging-info']").getText() ;
		
		System.out.println(ErrorMsg);
		if(ErrorMsg.contains("No records to display")) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
		//driver.close();
		
	}

}
