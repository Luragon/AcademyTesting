
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AuthenticationPage;
import Pages.CreateAccountPage;
import Pages.MainPage;

public class CreateAccountTest {

	WebDriver driver;

	@BeforeTest
	public void setBaseURL() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soular\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test
	public void Sign_Up() throws InterruptedException {
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		AuthenticationPage authPage = PageFactory.initElements(driver, AuthenticationPage.class);

		// Click sign in button
		mainpage.openSignInPage();

		// Enter email to be register
		authPage.enterRegisterEmail("testAccount@team2.com");

		// Click create account
		authPage.clickCreateAccountButton();
	}

	//Before FillInformation, SignUp is needed to be executed
	
	@Test
	public void fillInformation() throws InterruptedException {

		
		CreateAccountPage createAccPage = PageFactory.initElements(driver, CreateAccountPage.class);

		// Input First Name
		createAccPage.enterName("Alan");

		// Input Last Name
		createAccPage.enterLastName("Test");

		// Input Email
		createAccPage.enterEmail("testAccount@team2.com");

		// Input Last Name
		createAccPage.enterPassword("12345");

		// Input day Date of Birth
		createAccPage.dayBirth("24");

		// Input month Date of Birth
		createAccPage.monthBirth(10);

		// Input year Date of Birth
		createAccPage.yearBirth("1990");

		// Input Address1 First Name
		createAccPage.enterAddress1FirstName("Alan");

		// Input Address1 Last Name
		createAccPage.enterAddress1LastName("Test");

		// Input Company Name
		createAccPage.enterCompany("");

		// Input Address1
		createAccPage.enterAddress("Test Street");

		// Input Address2
		createAccPage.enterAddress2("");

		// Input City Name
		createAccPage.enterCity("Test City");

		// Input State
		createAccPage.enterState("Connecticut");

		// Input State
		createAccPage.enterPostalCode("68934");

		// Input Additional Info
		createAccPage.enterAdditional("Additional Info Test");

		// Input Home Phone Info
		createAccPage.enterHomePhone("8181878564");

		// Input Mobile Phone Info
		createAccPage.enterMobilePhone("8181878564");

		// Input Additional Info
		createAccPage.enterAddressAlias("My Adress Test");

		// Sign Up
		createAccPage.finishAccount();
	}

	@AfterTest
	public void endSession() {
		driver.quit();
	}
}
