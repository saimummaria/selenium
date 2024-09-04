package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;

	public Homepage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
