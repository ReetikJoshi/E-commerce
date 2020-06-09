package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	public WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	WebElement dress;
	
	public WebElement dress() {
		return dress;
	}
	
	@FindBy(xpath="//div[@class='shopping_cart']/a")
	WebElement cart;
	
	
	public WebElement cart() {
		return cart;
	}
}
