package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	public WebDriver driver;
	
	public WebDriver initDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void quitDriver() {
		if (driver!=null) {
			driver.close();
		}
	}
	
	
}
