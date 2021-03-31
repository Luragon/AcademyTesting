package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

	final WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	
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

	
	public void addProductFromHome() throws InterruptedException {
		AddToCartH.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}

	
	public void addProductFromMenu() throws InterruptedException {
		AddToCartM.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}
	
	public void addProductFromSearch(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(3000);
		searchButton.click();
		Thread.sleep(3000);
		AddToCartS.click();
		Thread.sleep(3000);
		ContinueShopping.click();
		Thread.sleep(3000);
	}

	public void searchClothes(String clothes) throws InterruptedException {
		searchBox.sendKeys(clothes);
		Thread.sleep(1000);
		searchButton.click();
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
}
