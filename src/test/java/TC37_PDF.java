import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TC37_PDF {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//harla//OneDrive//Escritorio//JAVA examples//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
		//Given Web Page loads correctly
		driver.get("http://automationpractice.com/index.php");	
	
		//And I click on "Sign In button"
		WebElement clickSignIn = driver.findElement(By.xpath("//a[@class='login']"));
		clickSignIn.click();
		
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,200)");
		
		Thread.sleep(2000);
		
		//When I input my email address
		WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));
		InputEmail.sendKeys("lolazo@yopmail.com");
		
		Thread.sleep(1000);
		
		//And I input my password
		WebElement InputPass = driver.findElement(By.xpath("//input[@id='passwd']"));
		InputPass.sendKeys("12345");
		
		Thread.sleep(1000);
		
		//Then I click on "Sign In" button
		WebElement clickSubmitLogin = driver.findElement(By.xpath(".//button[@id='SubmitLogin']"));
		clickSubmitLogin.click();
		
		js.executeScript("window.scrollBy(0,200)");
		
		//Then click on "Order history and details"
		WebElement clickSubmitOrders = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a"));
		clickSubmitOrders.click();
		
		Thread.sleep(1000);
		
		//Then click on PDF
		WebElement clickSubmitPDF = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr[1]/td[6]/a"));
		clickSubmitPDF.click();
		
		
		Thread.sleep(10000);

		
	
	}

}