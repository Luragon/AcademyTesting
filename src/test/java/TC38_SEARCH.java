	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class TC38_SEARCH {
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:/Users/Work/Downloads/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://automationpractice.com/index.php");
			
			driver.manage().window().maximize();
			
			WebElement searchButton = null;
			WebElement searchBox = driver.findElement(By.cssSelector("input#search_query_top"));
			
			
		
			searchBox.sendKeys("Blouses");
			Thread.sleep(1000);
			WebElement clickSubmitOrders = driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button"));
			clickSubmitOrders.click();
			Thread.sleep(2000);
			
			
			
			
			driver.quit();
		}
		}