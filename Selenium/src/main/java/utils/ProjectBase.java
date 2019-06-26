package utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.LearnExcel;

public class ProjectBase 

{
	public String excelFileName;
	public ChromeDriver driver;
	
	
	@Parameters ({"username","password"})
	@BeforeMethod
	public void launchApp(String un, String pw)
	{
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	 driver = new ChromeDriver() ;
	// Step 2: Passing the URL
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	//Step 3: Find and Enter User name and Password
	driver.findElementById("username").sendKeys(un);
	
	driver.findElementById("password").sendKeys(pw);
	
	//Step 4: Click on Login button
	driver.findElementByClassName("decorativeSubmit").click();
	
	// Step 5: Click on CRM/SFA link
	driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@AfterMethod
	public void closedriver()
	{
		driver.close();
	}
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException
	
	{
		
		
		LearnExcel excel = new LearnExcel();
		return excel.excelRead(excelFileName);
		//String [][] data = new String[2][3];
		
		/*data[0][0] = "Capgemini";
		data[0][1] = "Bhaskar";
		data[0][2] = "Kanduru";
		
		data[1][0] = "Infosys";
		data[1][1] = "Anil";
		data[1][2] = "Kumar";
		return data; */
	} 

}
