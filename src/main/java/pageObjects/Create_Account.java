package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Account {

	public WebDriver driver;

	public Create_Account(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email_create")
	WebElement new_email;

	@FindBy(id = "SubmitCreate")
	WebElement create;

	

	public WebElement new_email() {
		return new_email;
	}

	public WebElement create() {

		return create;
	}


}
