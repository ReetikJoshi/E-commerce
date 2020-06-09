package automation;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Dress;
import pageObjects.ProductType;
import pageObjects.Product_Overview;
import resources.Base;

public class DressCount extends Base {

	@BeforeTest
	public void initialize() throws IOException {
		driver = InitializeDriver();
	}

	@Test
	public void getCount() throws InterruptedException {
		ProductType p = new ProductType(driver);
		p.dress().click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		Dress d = new Dress(driver);
		d.casual().click();
		js.executeScript("window.scrollBy(0,700)");
		Product_Overview po = new Product_Overview(driver);
		System.out.println(po.allDress().getSize());

	}
}
