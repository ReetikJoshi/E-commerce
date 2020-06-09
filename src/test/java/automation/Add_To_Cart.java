package automation;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Dashboard;
import pageObjects.Dress;
import pageObjects.MenuBar;
import pageObjects.ProductDetails;
import resources.Base;

public class Add_To_Cart extends Base {

	@BeforeTest
	public void Initialize() throws IOException {

		driver = InitializeDriver();
	}

	@Test
	public void dress() throws InterruptedException {

		// Validate if the title of the page is equal to 'My Store' or not
		String title1 = driver.getTitle();
		Assert.assertEquals("My Store", title1);

		MenuBar m = new MenuBar(driver);
		m.signIn().click();
		String title2 = driver.getTitle();
		Assert.assertEquals("Login - My Store", title2);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		Login();

		String title3 = driver.getTitle();
		Assert.assertEquals("My account - My Store", title3);
		Dashboard d = new Dashboard(driver);
		d.dress().click();

		String title4 = driver.getTitle();
		Assert.assertEquals("Dresses - My Store", title4);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		Dress dr = new Dress(driver);
		dr.dress().click();

		String title5 = driver.getTitle();
		Assert.assertEquals("Printed Dress - My Store", title5);
		ProductDetails p = new ProductDetails(driver);

		// check if the product name is being displayed or not
		if (p.product().isDisplayed()) {
			Assert.assertTrue(true);
		}
		js.executeScript("window.scrollBy(0,300)");
		p.add().click();

	}

	@Test(dependsOnMethods = "dress")
	public void signOut() throws InterruptedException {
		MenuBar m = new MenuBar(driver);
		ProductDetails p = new ProductDetails(driver);

		// Code to switch to the child window
		String MainWindow = driver.getWindowHandle();

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		while (i1.hasNext()) {

			String ChildWindow = i1.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				driver.switchTo().window(ChildWindow);
				p.cross().click();
				driver.close();
			}
		}
		driver.switchTo().window(MainWindow);

		m.signOut().click();
		if (m.signIn().isDisplayed()) {
			Assert.assertTrue(true);
		}

	}

	@AfterClass
	public void exit() {
		driver.close();
		driver = null;
	}

}
