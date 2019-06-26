package week2.Assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		// Step 1: Launching the browser
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
		driver.close();
		
	}

}
