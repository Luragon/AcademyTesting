

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.MainPage;

public class TC26_Remove_product_from_cart_summary {

WebDriver driver;
	
	@BeforeTest
	public void setBaseURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","K://Descargas//chrome//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	

	@Test
	public void TC26_Remove_product_from_cart_summary() throws InterruptedException{
		//Step 1. El Usuario busca un vestido
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		mainpage.searchClothes("dress");
				
		//Step 2 El Usuario da click a un vestido 
		mainpage.dress();
				
		//Step 3 El usuario da click a agregar al carrito
		mainpage.cart();
		
		//Step 4 El usuario da click en proceed to checkout
		mainpage.checkout();
		
		//Step 5 El usuario da click en el icono de eliminar producto en la pagina de cart summary
		mainpage.trash();
		
	}
	
	
	
	@AfterTest
	public void endSession() {
		driver.quit();
	}
}