package Step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDeff {
	static WebDriver driver;
    static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
    static JavascriptExecutor js = (JavascriptExecutor)driver;
	@Given("Launch the  Chrome browser")
	public void launch_the_chrome_browser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();

	}

	@Given("Navigate to the Shopping site url")
	public void navigate_to_the_shopping_site_url() {
		driver.get("https://askomdch.com/");

	}

	@When("Navigate to the Account page")
	public void navigate_to_the_account_page() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Account'])[2]"))).click();

	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Sandy");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sandy123");
		driver.findElement(By.xpath("//button[@class='woocommerce-button button woocommerce-form-login__submit']")).click();

	}

	@When("Go to Home Page")
	public void go_to_home_page() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Home'])[2]"))).click();

	}

	@Then("Add to cart the products")
	public void add_to_cart_the_products() {
		driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[1]/a")).click();;

	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,450)", "");
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-product_id='1205']")));
	    driver.findElement(By.xpath("//a[@data-product_id='1205']")).click();
	    driver.findElement(By.xpath("//a[@data-product_id='1198']")).click();

	}

	@Then("View the products in cart page")
	public void view_the_products_in_cart_page() {
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='added_to_cart wc-forward']")));
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='added_to_cart wc-forward']"))).click();;
	    //driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']")).click();	

	}

	@Given("Navigate to the Shopping url")
	public void navigate_to_the_shopping_url() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://askomdch.com/");

	}

	@When("Navigate to the Cart page")
	public void navigate_to_the_cart_page() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='ast-cart-menu-wrap'])[2]"))).click();

	}

	@When("Proceed to checkout")
	public void proceed_to_checkout() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='checkout-button button alt wc-forward']"))).click();

	}

	@When("Enter the shipping details")
	public void enter_the_shipping_details() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='billing_first_name']"))).sendKeys("Santhosh");
		    driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("G");
		    js.executeScript("window.scrollBy(0,450)", "");
		    
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='selection'])[1]")));
		    driver.findElement(By.xpath("(//span[@class='selection'])[1]")).click();
		    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("india");
		    driver.findElement(By.xpath("//li[text()='India']")).click();	      
		    
		    driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("Ramapuram");	    
		    driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Chennai");
		    
		    driver.findElement(By.xpath("(//span[@class='selection'])[2]")).click();
		    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("tamil nadu");
		    driver.findElement(By.xpath("//li[text()='Tamil Nadu']")).click();
		    
		    driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("600006");
		    driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("sandy29@gmail.com");


	}

	@Then("click cash on delivery and Place order")
	public void click_cash_on_delivery_and_place_order() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='cod']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='place_order']"))).click();

	}

	@Then("Logging out the shopping site")
	public void logging_out_the_shopping_site() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[text()='Account'])[2]"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))).click();
		driver.close();

	}


}