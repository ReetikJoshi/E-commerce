package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.MenuBar;
import pageObjects.Create_Account;
import pageObjects.Register;
import resources.Base;

public class Register_User extends Base {
	public WebDriver driver;

	@BeforeTest
	public void Initialize() throws IOException {
		// Initialize the browser and go to the url
		driver = InitializeDriver();

	}

	@Test
	public void landingPage() throws IOException {

		// gets the links present in the page
		Integer linkCount = driver.findElements(By.tagName("a")).size();
		// Check if the links present is equal to '149' or not
		if (linkCount == 149) {

			Assert.assertTrue(true);
		}

		MenuBar hp = new MenuBar(driver);
		hp.signIn().click();

	}

	@Test(dependsOnMethods = "landingPage")
	public void account() throws InterruptedException {

		// Scroll vertically as per the given y-axis value
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);
		Create_Account l = new Create_Account(driver);
		l.new_email().sendKeys("abc123nepalesee@yahoo.com");
		l.create().click();
	}

	@Test(dependsOnMethods = "account", dataProvider = "data")

	public void register(String fname, String lname, String pass, String day, String month, String year,
			String con_fname, String con_lname, String company, String address1, String address2, String city,
			String state, String postal_code, String info, String home_phone, String mob_phone, String alias_address) {

		Register r = new Register(driver);
		r.gender().click();
		r.firstname().sendKeys(fname);
		r.lastname().sendKeys(lname);
		r.password().sendKeys(pass);
		Select days = new Select(r.days());
		days.selectByValue(day);
		Select months = new Select(r.months());
		months.selectByValue(month);
		Select years = new Select(r.years());
		years.selectByValue(year);
		r.newsletter().click();
		r.offers().click();
		r.again_firstname().sendKeys(con_fname);
		r.again_lastname().sendKeys(con_lname);
		r.company().sendKeys(company);
		r.address1().sendKeys(address1);
		r.address2().sendKeys(address2);
		r.city().sendKeys(city);
		Select states = new Select(r.state());
		states.selectByValue(state);
		r.postal_code().sendKeys(postal_code);
		r.info().sendKeys(info);
		r.home_phone().sendKeys(home_phone);
		r.mobile_phone().sendKeys(mob_phone);
		r.alias_address().clear();
		r.alias_address().sendKeys(alias_address);
		r.register().click();

	}

	@DataProvider
	public Object[][] data() {

		Object[][] data = new Object[1][18];
		data[0][0] = "ABC";
		data[0][1] = "XYZ";
		data[0][2] = "12345";
		data[0][3] = "1";
		data[0][4] = "10";
		data[0][5] = "1991";
		data[0][6] = "ABC";
		data[0][7] = "XYZ";
		data[0][8] = "ABCDEF";
		data[0][9] = "Carroll Avenue";
		data[0][10] = "anm";
		data[0][11] = "city";
		data[0][12] = "5";
		data[0][13] = "90210";
		data[0][14] = "I love automation";
		data[0][15] = "3434340000";
		data[0][16] = "3223200000";
		data[0][17] = "def";

		return data;
	}

	@AfterTest
	public void exit() {
		
		//closing the opened window and destroying the life of driver object
		driver.close();
		driver = null;
	}

}
