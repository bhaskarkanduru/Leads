package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassWork {

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()= 'Try it']").click();
		Alert myAlert = driver.switchTo().alert();
		String alertText = myAlert.getText();
		System.out.println(alertText);
		myAlert.sendKeys("Bhaskar Kanduru");
		myAlert.accept();
		
		boolean b = driver.findElementByXPath("//p[@id='demo']").getText().contains("Bhaskar Kanduru");
		
		System.out.println(b);
				
	}

}
