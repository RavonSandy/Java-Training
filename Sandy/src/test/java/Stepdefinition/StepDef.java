package Stepdefinition;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	static WebDriver driver;
	static WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	@Given("Launch the chrome browser")
	public void launch() {
		ChromeOptions chromeoptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeoptions);
		driver.manage().window().maximize();
		
	}

	@And("Navigate to the url")
	public void navigate() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
    @When("Enter the username and password")
    public void logcred() {
    	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
    
    @And("Click the login button")
    public void click() {
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
    }
   
    @Then("Validate the home page")
    public void validate() {
    	String s1 = "Dashboard";
		String verify = driver.findElement(By.xpath("//h1")).getText();
		assertEquals(s1,verify);
    }
    
    @And("Logout the application")
    public void logout() throws InterruptedException{
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))).click();
		driver.close();
    	
    }



}
