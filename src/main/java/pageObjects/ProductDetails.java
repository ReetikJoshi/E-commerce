package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails {
	public WebDriver driver;

	public ProductDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".exclusive[name='Submit']")
	WebElement add;

	public WebElement add() {

		return add;
	}

	@FindBy(id = "product_reference")
	WebElement product_name;

	public WebElement product() {
		return product_name;

	}

	@FindBy(css = ".cross")
	WebElement cross;

	public WebElement cross() {
		return cross;
	}

	@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2")
	WebElement message;

	public WebElement message() {
		return message;
	}

}
