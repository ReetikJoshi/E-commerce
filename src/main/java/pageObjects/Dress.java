package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress {

	
	public WebDriver driver;
	
	public Dress(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".subcategory-image a[title='Casual Dresses']")
	WebElement casual;
	
	@FindBy(css=".subcategory-image a[title='Evening Dresses']")
	WebElement evening;
	
	@FindBy(css=".subcategory-image a[title='Summer Dresses']")
	WebElement summer;

	@FindBy(xpath ="(//a[@class='product-name'])[2]" )
	WebElement dress;
	
	public WebElement dress() {
		return dress;
	}
	
	public WebElement casual() {
		return casual;
	}
	
	public WebElement evening() {
		return evening;
	}
	
	public WebElement summer() {
		return summer;
	}
}
