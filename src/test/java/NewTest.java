import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.MainPage;

public class NewTest {
WebDriver driver;
	
	@BeforeTest
  public void SetBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Work/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);				
  }
		
  @Test
  public void LoginHappyPath() throws InterruptedException {
	MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.LoginHP();
		Thread.sleep(3000);
	  
  }
  
  @Test
  public void EmailReq() throws InterruptedException {
	  MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.LoginER();
		Thread.sleep(3000);
	  
  }
  
  @Test
  public void PassReq() throws InterruptedException {
	  MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.LoginPR();
		Thread.sleep(3000);
	  
  }
  
  @Test
  public void AuthFailed() throws InterruptedException {
	  MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.LoginAF();
		Thread.sleep(3000);
  }

 

  @AfterTest
  public void EndSession() {
	  driver.quit();
	  
  }

}
