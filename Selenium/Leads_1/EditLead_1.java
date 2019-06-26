package week2.Assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
