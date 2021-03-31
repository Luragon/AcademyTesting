package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

	final WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(id="id_gender1")
	WebElement mrRadio;
	
	@FindBy(id="id_gender2")
	WebElement mrsRadio;
	
	@FindBy(id="customer_firstname")
	WebElement firstNameTextBox;
	
	@FindBy(id="customer_lastname")
	WebElement lastNameTextBox;
	
	@FindBy(id="email")
	WebElement emailTextBox;
	
	@FindBy(id="passwd")
	WebElement passwordTextBox;
	
	@FindBy(id="days")
	WebElement dayDropdown;
	
	@FindBy(id="months")
	WebElement monthDropdown;
	
	@FindBy(id="years")
	WebElement yearDropdown;
	
	@FindBy(id="newsletter")
	WebElement signUpForNewsletterCheckBox;
	
	@FindBy(id="optin")
	WebElement receiveSpecialCheckBox;
	
	@FindBy(id="firstname")
	WebElement addressFirstNameTextBox;
	
	@FindBy(id="lastname")
	WebElement addressLastNameTextBox;
	
	@FindBy(id="company")
	WebElement companyTextBox;
	
	@FindBy(id="address1") 
	WebElement addressTextBox;
	
	@FindBy(id="address2")
	WebElement address2TextBox;
	
	@FindBy(id="city")
	WebElement cityTextBox;
	
	@FindBy(id="id_state")
	WebElement stateDropdown;
	
	@FindBy(id="postcode")
	WebElement zipCodeTextBox;
	
	@FindBy(name="id_country")
	WebElement countryDropdown;
	
	@FindBy(id="other")
	WebElement additionalInfoTextBox;
	
	@FindBy(id="phone")
	WebElement homePhoneTextBox;
	
	@FindBy(id="phone_mobile")
	WebElement mobilePhoneTextBox;
	
	@FindBy(id="alias")
	WebElement addressAliasTextBox;
	
	@FindBy(id="submitAccount")
	WebElement registerButton;
	
	public void selectGender(int gender) throws InterruptedException {
		Select rb1 = new Select(mrRadio);
		rb1.selectByIndex(gender);
		Thread.sleep(2000);
	}
	
	public void selectGender2(int gender2) throws InterruptedException {
		Select rb2 = new Select(mrsRadio);
		rb2.selectByIndex(gender2);
		Thread.sleep(2000);
	}
	
	
	public void enterName(String name) throws InterruptedException {
		firstNameTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	public void enterLastName(String name) throws InterruptedException {
		lastNameTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	
	
	public void enterEmail(String name) throws InterruptedException {
		
		//emailTextBox.equals();
		emailTextBox.clear();
		emailTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	
	
	public void enterPassword(String name) throws InterruptedException {
		passwordTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	
	public void dayBirth(String day) throws InterruptedException {
		Select dropdown = new Select(dayDropdown);
		dropdown.selectByValue(day);
		Thread.sleep(2000);
	}
	public void monthBirth(int month) throws InterruptedException {
		Select dropdown = new Select(monthDropdown);
		dropdown.selectByIndex(month);
		Thread.sleep(2000);
	}
	public void yearBirth(String year) throws InterruptedException {
		Select dropdown = new Select(yearDropdown);
		dropdown.selectByValue(year);
		Thread.sleep(2000);
	}
	public void enterAddress1FirstName(String name) throws InterruptedException {
		addressFirstNameTextBox.clear();
		addressFirstNameTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	public void enterAddress1LastName(String name) throws InterruptedException {
		addressLastNameTextBox.clear();
		addressLastNameTextBox.sendKeys(name);
		Thread.sleep(2000);
	}
	public void enterCompany(String CompName) throws InterruptedException {
		companyTextBox.sendKeys(CompName);
		Thread.sleep(2000);
	}
	public void enterAddress(String address) throws InterruptedException {
		addressTextBox.sendKeys(address);
		Thread.sleep(2000);
	}
	public void enterAddress2(String address2) throws InterruptedException {
		address2TextBox.sendKeys(address2);
		Thread.sleep(2000);
	}
	public void enterCity(String city) throws InterruptedException {
		cityTextBox.sendKeys(city);
		Thread.sleep(2000);
	}
	public void enterState(String state) throws InterruptedException {
		Select dropdown = new Select(stateDropdown);
		dropdown.selectByVisibleText(state);
		Thread.sleep(2000);
	}
	public void enterPostalCode(String postal) throws InterruptedException {
		zipCodeTextBox.sendKeys(postal);
		Thread.sleep(2000);
	}
	public void enterAdditional(String addInfo) throws InterruptedException {
		additionalInfoTextBox.sendKeys(addInfo);
		Thread.sleep(2000);
	}
	public void enterHomePhone(String homePhone) throws InterruptedException {
		homePhoneTextBox.sendKeys(homePhone);
		Thread.sleep(2000);
	}
	public void enterMobilePhone(String mobilePhone) throws InterruptedException {
		mobilePhoneTextBox.sendKeys(mobilePhone);
		Thread.sleep(2000);
	}
	public void enterAddressAlias(String addressAlias) throws InterruptedException {
		addressAliasTextBox.clear();
		addressAliasTextBox.sendKeys(addressAlias);
		Thread.sleep(2000);	
	}
	public void finishAccount() throws InterruptedException {
		registerButton.click();
		Thread.sleep(2000);	
	}
}
