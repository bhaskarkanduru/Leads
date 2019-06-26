package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElementByXPath("//div[@id = 'draggable']");
		WebElement destination = driver.findElementByXPath("//div[@id = 'droppable']");
		
		Actions builder = new Actions(driver);
		
       // builder.moveToElement(destination);
		builder.dragAndDrop(source, destination).perform();

	}

}
