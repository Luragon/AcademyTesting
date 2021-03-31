
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
		System.setProperty("webdriver.chrome.driver","C://Users//vinke//Downloads//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	@Test
	public void payment() throws InterruptedException{
		//Step 1. El Usuario busca un vestido
		MainPage mainpage = PageFactory.initElements(driver, MainPage.class);
		
		
		mainpage.searchClothes("dress");
				
		//Step 2 El Usuario da click a un vestido 
		mainpage.dress();
				
		//Step 3 El usuario da click a agregar al carrito
		mainpage.cart();
		
		//Step 4 El usuario da click en proceed to checkout
		mainpage.checkout();
		
		//Step 5 El usuario da click en proceed to checkout
		mainpage.checkouttwo();
		
		//Step 6 El usuario ingresa su correo
		mainpage.writeEmail("kevinibarraloera@gmail.com");
		
		// Step 7 El usuario ingresa su password
		mainpage.writePassword("dragonfist98");
		
		// Step 8 El usuario inicia sesion dando click en submit
		mainpage.Submitbtn();
		
		//Step 9 El usuario da click en proceed to checkout
		mainpage.checkouthree();
		
		//Step 10 El usuario da click en el checkbox donde acepta los terminos
		mainpage.agreeToTerms();
		
		//Step 11 El usuario da click en proceed to checkout
		mainpage.checkoutfour();
		
		//Step 12 El usuario selecciona cheque como opcion de compra
		mainpage.bankwire();
		
		//Step 12 El usuario confirma
		mainpage.confirm();
							
	}
		
		
	@AfterTest
public void endSession() {
driver.quit();
}
}