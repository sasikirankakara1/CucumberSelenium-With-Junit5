package pages;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedDashBoard {

	public WebDriver driver;
	public LoggedDashBoard(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement text;
	
	public void assertText(String texts) {
		assertEquals(text.getText().toString(),texts);
	}
}
