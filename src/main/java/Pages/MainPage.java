package Pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	final WebDriver driver;
	

	
	public MainPage(WebDriver driver) {
		this.driver=driver;
		

	}
	
	@FindBy(xpath="//a[@class='login']")
	WebElement clickSignIn;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement InputEmail;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement InputPass;
	
	@FindBy(xpath=".//button[@id='SubmitLogin']")
	WebElement clickSubmitLogin;
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@name='submit_search']")
	WebElement searchButton;
	
	@FindBy(xpath="//img[@alt='My Store']")
	WebElement logoImg;
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signIn;
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/ul/li[1]/div/div[@class='right-block']/div[@class='button-container']/a")
	WebElement AddToCartH;
	
	@FindBy(xpath="//*[contains(@title, 'Continue shopping')]")
	WebElement ContinueShopping;
	
	@FindBy(xpath="//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[1]/a")
	WebElement AddToCartM;
	
	@FindBy(xpath="//*[@class='product_list grid row']/li[1]/div/div[@class='right-block']/div[@class='button-container']/a")
	WebElement AddToCartS;	

	@FindBy(xpath="//div[@class='product-container']")
	WebElement dress;
	
	@FindBy(xpath="//button[@class='exclusive']")
	WebElement cart;
	
	@FindBy(xpath="//span[@class='continue btn btn-default button exclusive-medium']")
	WebElement continueshopping;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
	WebElement checkouttwo;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	WebElement checkoutthree;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button")
	WebElement checkoutfour;


	@FindBy(xpath="//a[@class='ajax_cart_block_remove_link']")
	WebElement removeitem;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	WebElement checkout;
	
	@FindBy(xpath="//i[@class='icon-trash']")
	WebElement trash;
	
	@FindBy(id ="email")
	WebElement emailTextbox;
	
	@FindBy(id = "passwd")
	WebElement passwordTextbox;
	 	
	@FindBy(id = "SubmitLogin")
	WebElement Submit;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
	WebElement termsCheckbox;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
	WebElement bankWire;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	WebElement confirmBankPayment;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	WebElement check;
	
	@FindBy(xpath="//*[@id='center_column']/div[1]/ul/li[1]")
	WebElement firstItemH;
	
	@FindBy(xpath="//*[@class='product_list grid row']/li[1]")
	WebElement firstItemM;
	
	public void addProductFromHome() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(firstItemH).perform();
		AddToCartH.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}

	
	public void addProductFromMenu() throws InterruptedException {
		
		AddToCartM.click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(firstItemM).perform();
		AddToCartS.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}
	
	public void addProductFromSearch(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.moveToElement(firstItemM).perform();
		Thread.sleep(3000);
		AddToCartS.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}
	
	public void goHome() throws InterruptedException {
		logoImg.click();
		Thread.sleep(1000);
	}
	
	public void openSignInPage() throws InterruptedException {
		signIn.click();
		Thread.sleep(1000);
	}
	
	
	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(500);
		searchButton.click();
	}
	
	public void writeEmail(String email) throws InterruptedException {
		emailTextbox.sendKeys(email);
		Thread.sleep(500);
	}
	

	public void writePassword(String password) throws InterruptedException {
		passwordTextbox.sendKeys(password);
		Thread.sleep(500);
	}
	
	public void Submitbtn() throws InterruptedException {
		Submit.click();
	}
	
	
	
	//Los void que agrege yo
	
	public void dress() throws InterruptedException {
		dress.click();
		Thread.sleep(5000);
	}
	
	public void cart() throws InterruptedException {
		cart.click();
		Thread.sleep(1500);
	}
	
	public void continueshopping() throws InterruptedException {
		continueshopping.click();
		Thread.sleep(500);
	}
	
	public void removeitem() throws InterruptedException {
		removeitem.click();
		Thread.sleep(500);
	}
	
	public void checkout() throws InterruptedException {
		checkout.click();
		Thread.sleep(500);
	}
	
	public void checkouttwo() throws InterruptedException {
		checkouttwo.click();
		Thread.sleep(500);
	}
	
	public void checkouthree() throws InterruptedException {
		checkoutthree.click();
		Thread.sleep(500);
	}
	
	public void checkoutfour() throws InterruptedException {
		checkoutfour.click();
		Thread.sleep(500);
	}
	
	public void bankwire() throws InterruptedException {
		bankWire.click();
		Thread.sleep(500);
	}
	
	public void check() throws InterruptedException {
		bankWire.click();
		Thread.sleep(500);
	}
	
	public void confirm() throws InterruptedException {
		confirmBankPayment.click();
		Thread.sleep(500);
	}
	
	
	public void trash() throws InterruptedException {
		trash.click();
		Thread.sleep(500);
	}
	
	public void agreeToTerms() throws InterruptedException {
		termsCheckbox.click();
		Thread.sleep(500);
	}
	
	public void LoginHP() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickSignIn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		InputEmail.sendKeys("lolazo@yopmail.com");
		Thread.sleep(1000);
		InputPass.sendKeys("12345");
		Thread.sleep(1000);
		clickSubmitLogin.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
	}
	
	
	public void LoginER() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickSignIn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		InputEmail.sendKeys("");
		Thread.sleep(1000);
		InputPass.sendKeys("12345");
		Thread.sleep(1000);
		clickSubmitLogin.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
	}
	
	public void LoginPR() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickSignIn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		InputEmail.sendKeys("lolazo@yopmail.com");
		Thread.sleep(1000);
		InputPass.sendKeys("");
		Thread.sleep(1000);
		clickSubmitLogin.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
	}
	
	public void LoginAF() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		clickSignIn.click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		InputEmail.sendKeys("lolazo@yopmail.com");
		Thread.sleep(1000);
		InputPass.sendKeys("12346");
		Thread.sleep(1000);
		clickSubmitLogin.click();
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
	}
	
}
