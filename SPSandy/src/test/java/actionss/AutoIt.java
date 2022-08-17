package actionss;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
  private static WebDriver driver = null;
  public static void main(String[] args) throws IOException, InterruptedException {
      driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://toolsqa.com/automation-practice-form");
      driver.findElement(By.id("photo")).click();
      Runtime.getRuntime().exec("");
      Thread.sleep(5000);
      driver.close();
  }
}



