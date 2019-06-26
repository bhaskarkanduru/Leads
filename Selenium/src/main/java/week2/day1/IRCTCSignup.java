package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSignup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementById("userRegistrationForm:userName").sendKeys("asdjfkdjsfkdsf");
		driver.findElementById("userRegistrationForm:password").sendKeys("bdsfdsfsdfdsgf");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("bdsfdsfsdfdsgf");
		
		WebElement sq = driver.findElementById("userRegistrationForm:securityQ");
		Select sqdropdown = new Select(sq);
		int size = sqdropdown.getOptions().size();
		System.out.println(size);
		sqdropdown.selectByIndex(size-1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("cdsdfsff");
		
		WebElement pl = driver.findElementById("userRegistrationForm:prelan");
		Select pldropdown = new Select(pl);
		pldropdown.selectByIndex(1);
		
		WebElement maleRadioBtn = driver.findElementById("userRegistrationForm:gender:1");
		maleRadioBtn.click();
		
		WebElement maritalStatusRadioBtn = driver.findElementById("userRegistrationForm:maritalStatus:1");
		maritalStatusRadioBtn.click();
		
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select countrydropdown= new Select(country);
		countrydropdown.selectByVisibleText("Australia");
		
		
		
	}

}
