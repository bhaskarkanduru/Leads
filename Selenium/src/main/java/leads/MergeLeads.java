package leads;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver() ;

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Leads']").click();

		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		Set<String> windowHandles = driver.getWindowHandles() ;
		List<String> handle = new LinkedList<>() ;
		for (String string : windowHandles) {
			handle.add(string) ;
		}		

		driver.switchTo().window(handle.get(1)) ;
		System.out.println(driver.getTitle()) ;
		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys("10095");

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);

		String text = driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").getText();
		System.out.println(text);

		driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").click();
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.switchTo().window(handle.get(0)) ;

		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

		Set<String> windowHandles2 = driver.getWindowHandles() ;
		List<String> handle2 = new LinkedList<>() ;
		for (String string2 : windowHandles2) {
			handle2.add(string2) ;					
		}
		System.out.println(handle2.size());
		driver.switchTo().window(handle2.get(1)) ;
		System.out.println(driver.getTitle()) ;

		driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys("10096");

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(5000);

		String text2 = driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").getText();
		System.out.println(text2);

		driver.findElementByXPath("(//div[@class ='x-grid3-hd-inner x-grid3-hd-partyId'])/following::tbody//td[1]//a").click();
		driver.switchTo().window(handle2.get(0)) ;

		driver.findElementByXPath("//a[text()='Merge']").click();

		driver.switchTo().alert().accept();

		driver.findElementByXPath("//a[text()='Find Leads']").click();

		driver.findElementByXPath("(//label[text() ='Lead ID:'])/following::input[1]").sendKeys("10095");

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
