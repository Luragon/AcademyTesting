import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.MainPage;

public class TC25_Remove_product_from_cart_dropdown {

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
	public void TC25_Remove_product_from_cart_dropdown() throws InterruptedException{
		
		//Step 1. User search for dress
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.searchClothes("dress");
		
		//Step 2 User click on first Dress 
		mainpage.dress();
		
		//Step 3 User click on add to cart
		mainpage.cart();
		
		//Step 4 User click on continue shopping
		mainpage.continueshopping();
		
		//Step 5 User unfolds the dropdown list on cart 
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		act.moveToElement(ele).perform();
		Thread.sleep(1000);
		
		//Step 6 User click on "x" on the cart dropdown list
		mainpage.removeitem();
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}