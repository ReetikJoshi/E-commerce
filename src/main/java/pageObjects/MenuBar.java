package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuBar {

	public WebDriver driver;

	public MenuBar(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "header_user_info")
	WebElement signIn;


	
	public WebElement signIn() {

		return signIn;
	}
	
	
	@FindBy(className="logout")
	WebElement signOut;
	
	public WebElement signOut() {
		return signOut;
	}
}
