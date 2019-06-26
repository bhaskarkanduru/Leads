package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> checkboxlist = driver.findElementsByXPath("//input[@type = 'checkbox']");
		
		System.out.println(checkboxlist.size());
		// To click on the last check box
		checkboxlist.get((checkboxlist.size())-1).click();
		
		//find no. of rows in the table
		
		
		WebElement table = driver.findElementByXPath("//table");
		//table.findElements(By.tagName("tr"));
		//table.findElements()
		
		//What is the progress of first row
		
		
		
	}

}
