package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {

	public WebDriver driver;

	public Register(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_gender1")
	WebElement gender;

	public WebElement gender() {
		return gender;
	}

	@FindBy(id = "customer_firstname")
	WebElement firstname;

	public WebElement firstname() {
		return firstname;
	}

	@FindBy(id = "customer_lastname")
	WebElement lastname;

	public WebElement lastname() {
		return lastname;
	}

	@FindBy(id = "passwd")
	WebElement password;

	public WebElement password() {
		return password;
	}

	@FindBy(id = "days")
	WebElement days;

	public WebElement days() {
		return days;
	}

	@FindBy(id = "months")
	WebElement months;

	public WebElement months() {
		return months;
	}

	@FindBy(id = "years")
	WebElement years;

	public WebElement years() {
		return years;
	}

	@FindBy(id = "newsletter")
	WebElement newsletter;

	public WebElement newsletter() {
		return newsletter;
	}

	@FindBy(id = "optin")
	WebElement offers;

	public WebElement offers() {
		return offers;
	}

	@FindBy(id = "firstname")
	WebElement again_firstname;

	public WebElement again_firstname() {
		return again_firstname;
	}

	@FindBy(id = "lastname")
	WebElement again_lastname;

	public WebElement again_lastname() {
		return again_lastname;
	}

	@FindBy(id = "company")
	WebElement company;

	public WebElement company() {
		return company;
	}

	@FindBy(id = "address1")
	WebElement address1;

	public WebElement address1() {
		return address1;
	}

	@FindBy(id = "address2")
	WebElement address2;

	public WebElement address2() {
		return address2;
	}

	@FindBy(id = "city")
	WebElement city;

	public WebElement city() {
		return city;
	}

	@FindBy(id = "id_state")
	WebElement state;

	public WebElement state() {
		return state;
	}

	@FindBy(id = "postcode")
	WebElement postal_code;

	public WebElement postal_code() {
		return postal_code;
	}

	@FindBy(id = "id_country")
	WebElement country;

	public WebElement country() {
		return country;
	}

	@FindBy(id = "other")
	WebElement info;

	public WebElement info() {
		return info;
	}

	@FindBy(id = "phone")
	WebElement home_phone;

	public WebElement home_phone() {
		return home_phone;
	}

	@FindBy(id = "phone_mobile")
	WebElement mobile_phone;

	public WebElement mobile_phone() {
		return mobile_phone;
	}

	@FindBy(id = "alias")
	WebElement alias_address;

	public WebElement alias_address() {
		return alias_address;
	}

	@FindBy(id = "submitAccount")
	WebElement register;

	public WebElement register() {
		return register;
	}

}
