package week2.Assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		driver.findElementByXPath("(//span[@class ='x-tab-strip-text '])[3]").click();
		
		driver.findElementByXPath("//label[text() ='Email Address:']/following::input[1]").sendKeys("Abcd12@gmail.com");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(8000);
		
		String text = driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-firstName'])/following::tbody//td[3]//a").getText();
		System.out.println(text);
		driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-firstName'])/following::tbody//td[3]//a").click();
		
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Duplicate Lead")) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
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
