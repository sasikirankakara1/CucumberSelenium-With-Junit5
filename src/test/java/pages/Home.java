package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	public WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#top-links>ul>li")
	private List<WebElement> navbarTabs;
	@FindBy(css = "ul[class='dropdown-menu dropdown-menu-right']>li")
	private List<WebElement> dropLists;

	public void openUrl(String url) {
		driver.get(url);
	}

	public void getNavDetails() {
		navbarTabs.forEach(p -> System.out.println(p.getAttribute("innerText")));
	}

	public void click_specific_tab_within_navbar(String text) {
		navbarTabs.stream().filter(p -> p.getText().contains(text)).findFirst().orElse(null).click();
	}

	public void click_specific_tab_sub_drop_down(String firstTabName, String subDropdownTabName) {
		click_specific_tab_within_navbar(firstTabName);
		dropLists.stream().filter(p -> p.getText().contains(subDropdownTabName)).findFirst().orElse(null).click();
	}
	public void click_specific_sub_tab(String tabName) {
		dropLists.stream().filter(p -> p.getText().contains(tabName)).findFirst().orElse(null).click();
	}

	@FindBy(id = "input-firstname")
	private WebElement firstName;
	public void setFirstName(String name) {
		firstName.sendKeys(name);
	}
	@FindBy(id = "input-lastname")
	private WebElement lastname;
	public void setLastName(String name) {
		lastname.sendKeys(name);
	}
	@FindBy(id = "input-email")
	private WebElement emailid;
	public void setEmail(String email) {
		emailid.sendKeys(email);
	}
	@FindBy(id = "input-telephone")
	private WebElement telephones;
	public void setTelephone(String number) {
		telephones.sendKeys(number);
	}
	@FindBy(id = "input-password")
	private WebElement passwords;
	public void setPassword(String password) {
		passwords.sendKeys(password);
	}
	@FindBy(id = "input-confirm")
	private WebElement inputConfirm;
	public void setConfirmPassword(String confirmPassword) {
		inputConfirm.sendKeys(confirmPassword);
	}
	@FindBy(css = "input[name='agree']")
	private WebElement policyCheck;
	public void setPolicyCheck() {
		policyCheck.click();
	}
	@FindBy(css = "input[class='btn btn-primary']")
	private WebElement continueBtn;
	public void clickSubmitButton() {
		continueBtn.click();
	}
}
