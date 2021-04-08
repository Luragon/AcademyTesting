
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MainPage;

public class SelectPaymentBankWire {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Work/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	@Test
	public void payment() throws InterruptedException{
MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		
		//Step 1. User searches "dress"
		mainpage.searchClothes("dress");
				
		//Step 2 User clicks on the first result of dress
		mainpage.dress();
				
		//Step 3 User clicks on add to cart
		mainpage.cart();
		
		//Step 4 User clicks on proceed to checkout
		mainpage.checkout();
		
		//Step 5 User clicks on proceed to checkout (two)
		mainpage.checkouttwo();
		
		//Step 6 User enters its email
		mainpage.writeEmail("kevinibalo@hotmail.com");
		
		// Step 7 User enters its password
		mainpage.writePassword("marinela");
		
		// Step 8 User clicks on submit
		mainpage.Submitbtn();
		
		//Step 9 User clicks on proceed to checkout (three)
		mainpage.checkouthree();
		
		//Step 10 User checks the agree to terms checkbox
		mainpage.agreeToTerms();
		
		//Step 11 User clicks on proceed to checkout (four)
		mainpage.checkoutfour();
		
		//Step 12 User selects bank wire as a payment option
		mainpage.bankwire();
		
		//Step 13 User confirms the purchase
		mainpage.confirm();
							
	}
		
		
	@AfterTest
public void endSession() {
driver.quit();
}
}