
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Work/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		// Given Web Page loads correctly
		driver.get("http://automationpractice.com/index.php");
		// And I click on "Sign In button"
		WebElement clickSignIn = driver.findElement(By.xpath("//a[@class='login']"));
		clickSignIn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		// When I input my email address
		WebElement InputEmail = driver.findElement(By.xpath("//input[@id='email']"));
		InputEmail.sendKeys("lolazo@yopmail.com");
		Thread.sleep(1000);
		// And I input my password
		WebElement InputPass = driver.findElement(By.xpath("//input[@id='passwd']"));
		InputPass.sendKeys("12345");
		Thread.sleep(1000);
		// Then I click on "Sign In" button
		WebElement clickSubmitLogin = driver.findElement(By.xpath(".//button[@id='SubmitLogin']"));
		clickSubmitLogin.click();
		js.executeScript("window.scrollBy(0,200)");
		// Add product
		WebElement clickAddproductbutton = driver.findElement(By.xpath("//a[@title='Women']"));
		clickAddproductbutton.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement product = driver.findElement(By.xpath("//*[@title='Faded Short Sleeve T-shirts']"));
		action.moveToElement(product).perform();
		WebElement clickaddcart = driver.findElement(By.xpath("//*[@title='Add to cart'][@data-id-product='1']"));
		clickaddcart.click();
		Thread.sleep(2000);
		// Checkout
		WebElement clickcheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickcheckout.click();
		Thread.sleep(2000);
		WebElement clickcheckout2 = driver
				.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		clickcheckout2.click();
		Thread.sleep(2000);

		// Address
		WebElement clickcheckout3 = driver.findElement(By.xpath("//*[@type='submit'][@name='processAddress']"));
		clickcheckout3.click();
		Thread.sleep(2000);

		// Cick terms of services
		WebElement clickcheckbox = driver.findElement(By.xpath("//*[@type='checkbox']"));
		clickcheckbox.click();
		Thread.sleep(2000);
		// Proceed to Checkout
		WebElement clickcheckout4 = driver.findElement(By.xpath("//*[@type='submit'][@name='processCarrier']"));
		clickcheckout4.click();
		Thread.sleep(2000);
		// Payment
		WebElement clickbankpayment = driver.findElement(By.xpath("//*[@class='bankwire']"));
		clickbankpayment.click();
		Thread.sleep(2000);
		// Confirm order
		WebElement clickConfirmorder = driver
				.findElement(By.xpath("//*[@class='button btn btn-default button-medium']"));
		clickConfirmorder.click();
		Thread.sleep(2000);
		WebElement validateordercomplete = driver
				.findElement(By.xpath("//*[@class='dark'][contains(text(),'Your order on My Store is complete.')]"));
		validateordercomplete.isDisplayed();
		Thread.sleep(2000);

	}

}
