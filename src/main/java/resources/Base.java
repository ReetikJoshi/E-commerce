package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public WebDriver driver;
	public WebDriver InitializeDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"//data.properties");
	
		prop.load(fs);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			//chrome initialization
			System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
						
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			//firefox initialization
			System.setProperty("webdriver.gecko.driver", "D:\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public WebDriver Login() {
		
		driver.findElement(By.id("email")).sendKeys("abc123nepalesee@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
		return driver;
	}
}
