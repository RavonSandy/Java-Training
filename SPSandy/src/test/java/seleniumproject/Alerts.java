package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	//	driver.switchTo().alert().accept();	
		driver.switchTo().alert().dismiss();			
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("Ok");
		driver.switchTo().alert().accept();
	
		
		Thread.sleep(2000);
		driver.close();
	
	}

}
