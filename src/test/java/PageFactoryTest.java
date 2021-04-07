

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.MainPage;

public class PageFactoryTest {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Work/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions actions = new Actions(driver);

		Thread.sleep(3000);
	}
	
	@Test
	public void addProductMain() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.addProductFromHome();
		Thread.sleep(2000);
	}
	
	@Test
	public void addProductMenu() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.addProductFromMenu();
		Thread.sleep(3000);
	}
	
	@Test
	public void addProductSearch() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.addProductFromSearch("blouse");
		Thread.sleep(3000);
	}
	
	
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
