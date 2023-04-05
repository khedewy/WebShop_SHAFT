package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class RegisterPage {
	private SHAFT.GUI.WebDriver driver;

	public RegisterPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By registerAssertion = By.xpath("//h1[text()='Register']");
	private final By genderButton = By.id("gender-male");
	private final By firstNameTxt = By.id("FirstName");
	private final By lastNameTxt = By.id("LastName");
	private final By emailTxt = By.id("Email");
	private final By passwordTxt = By.id("Password");
	private final By confirmPasswordTxt = By.id("ConfirmPassword");
	private final By registerBtn = By.id("register-button");
	private final By successfulRegisterMessage = By.xpath("//div[@class='result']");

	public String getAssertionMessageText() {
		return driver.element().getText(registerAssertion);
	}

	public By getRegisterAssertionLocator() {
		return registerAssertion;
	}

	public void EnterUserData(String fName, String lName, String email, String password) {
		driver.element().click(genderButton);
		driver.element().type(firstNameTxt, fName);
		driver.element().type(lastNameTxt, lName);
		driver.element().type(emailTxt, email);
		driver.element().type(passwordTxt, password);
		driver.element().type(confirmPasswordTxt, password);
		driver.element().click(registerBtn);
	}

	public String getSuccessfulRegisterMessage() {
		return driver.element().getText(successfulRegisterMessage);
	}

	public By sucessfullRgisterLocator() {
		return successfulRegisterMessage;
	}
}
