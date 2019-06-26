package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.text.ParseException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;


public class ZoomCar {

	public static void main(String[] args) 
	
	{
		/*System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[@ title = 'Start your wonderful journey']").click();
		driver.findElementByXPath("//div[text()='Popular Pick-up points']/following-sibling::div[1]").click();
		driver.findElementByXPath("//button[text() = 'Next']").click(); */
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.findElementByXPath("//a[text() = 'Start your wonderful journey']").click();
		driver.findElementByXPath("(//div[text() = 'Popular Pick-up points']/following-sibling::div)[1]").click();
		
		String selectedplace = driver.findElementByXPath("//div[@class = 'items picked']").getText();
		
		String trimedplpace = selectedplace.trim();
		
		System.out.println(trimedplpace);
		
		driver.findElementByXPath("//button[text() = 'Next']").click();
		
		
		// get a calendar instance, which defaults to "now"

	    Calendar calendar = Calendar.getInstance();

	   

	    // get a date to represent "today"

	    Date today = calendar.getTime();

	    //System.out.println("today:    " + today);


	    // add one day to the date/calendar

	    calendar.add(Calendar.DAY_OF_YEAR, 1);
	    // now get "tomorrow"

	    Date tomorrow = calendar.getTime();
	    
	    // print out tomorrow's date

	    //System.out.println("tomorrow: " + tomorrow);
	    
	    String tomdate = tomorrow.toString();
	    
	    String xpath = tomdate.substring(0, 3);
	    
	    //System.out.println(xpath);
	    
	    String xpath2 = "//div[text() ="+"'"+xpath+"'"+"]";
	    //System.out.println(xpath2);
	    
	    driver.findElementByXPath(xpath2).click();
		driver.findElementByXPath("//button[text() = 'Next']").click();
		
		String todate = driver.findElementByXPath("//div[@class = 'day picked ']/div").getText();
		
		//System.out.println(todate);
		
		driver.findElementByXPath("//button[text() = 'Done']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	List<WebElement> cars = driver.findElementsByClassName("car-listing");
	int noofcars = cars.size();
	//System.out.println(noofcars);
	List<String> Prices  = new LinkedList<>();

	for (int i = 1; i <= noofcars; i++) {
		
		String pricexpath = "(//div[@class = 'price'])"+"["+i+"]";
		//System.out.println(pricexpath);
		String Price = driver.findElementByXPath(pricexpath).getText();
		String finalprice = Price.trim();
		
		//System.out.println(finalprice);
		String finalprice2 = finalprice.substring(2);
		//System.out.println(finalprice2);
		Prices.add(finalprice2);
		
	}


	System.out.println("List of prices :"+Prices);

	driver.findElementByXPath("(//div[@class = 'sort-bar car-sort-layout']/div)[1]").click();
	String carname = driver.findElementByXPath("(//div[@class = 'details']/h3)[1]").getText();
	String highprice = driver.findElementByXPath("(//div[@class = 'price'])[1]").getText();
	String highprice2 = highprice.substring(2);
	System.out.println("The car with highest price :"+carname);
	System.out.println("The Highest Price :"+highprice2);
	driver.findElementByXPath("(//button[text() = 'BOOK NOW'])[1]").click();

	// driver.close();

	}

}
