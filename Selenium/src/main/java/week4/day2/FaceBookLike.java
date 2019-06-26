package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class FaceBookLike {

	public static void main(String[] args) 
	
	{
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id ='email']").sendKeys("bhaskar.kanduru@gmail.com");
		driver.findElementByXPath("//input[@name ='pass']").sendKeys("hymavathi");
		driver.findElementByXPath("//label[@id ='loginbutton'] / input").click();
		driver.findElementByXPath("//div[@class='_5861 navigationFocus textInput _5eaz']/input[2]").sendKeys("Test Leaf");
		driver.findElementByXPath("//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']").click(); */
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@data-testid='royal_email']").sendKeys("bhaskar.kanduru@gmail.com");
		driver.findElementByXPath("//input[@data-testid='royal_pass']").sendKeys("hymavathi");
		driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();
		//Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		driver.findElementByXPath("//li[@data-edge='keywords_places']").click();
		//Thread.sleep(2000);
		String testleafname = driver.findElementByXPath("//a[text()='TestLeaf']").getText();
		if (testleafname.equals("TestLeaf")) {
			
			System.out.println("TestLeaf is displayed");
			String likedtext = driver.findElementByXPath("(//button[@data-testid='search_like_button_test_id'])[1]").getText();
			if (likedtext.equals("Like")) {
				driver.findElementByXPath("(//button[@data-testid='search_like_button_test_id'])[1]").click();
				
			}else if(likedtext.equals("Liked")) {
				System.out.println("TestLeaf is already liked");
				
			}
		}
		driver.findElementByXPath("//a[text()='TestLeaf']").click();
		String browsertitle = driver.getTitle();
		
		if (browsertitle.contains("TestLeaf")) {
			System.out.println("TestLeaf is present in the title");
			
		}
		
		String nooflikestext = driver.findElementByXPath("(((//div[@class='clearfix _ikh'])[2])//div)[3]").getText();
		int length = nooflikestext.length();
		String likednumber = nooflikestext.substring(0, (length-17));
		System.out.println(likednumber);
		driver.close();
		

	}

}
