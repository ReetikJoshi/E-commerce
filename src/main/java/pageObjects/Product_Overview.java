package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Overview {

	public WebDriver driver;
	public Product_Overview(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css=".replace-2x.img-responsive[title='Printed Dress']")
	WebElement allDresses;
	
	public WebElement allDress() {
		return allDresses;
	}
}
