package seleniumproject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takesnap {
	
	public void takesnaps(WebDriver webdriver,String filePath) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)webdriver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File des = new File(filePath);
		FileHandler.copy(src,des);

		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		takesnap t = new takesnap();		
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		t.takesnaps(driver,"C:\\Users\\santhoshg\\Desktop\\Eclipse\\screenshot.png");
		driver.close();
		

	}

}
