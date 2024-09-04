package baseutil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
 WebDriver driver;
 @BeforeMethod
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\7572m\\eclipse-workspace\\com.amazon.seleniumHW\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.amazon.com/");
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }
 public void tearUp() {
		driver.quit();
	}
}
