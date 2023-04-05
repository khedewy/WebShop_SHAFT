package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class LoginPage {
	private SHAFT.GUI.WebDriver driver;

	public LoginPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By loginPageAssertion = By.xpath("//h1[text()='Welcome, Please Sign In!']");
	private final By emailTxt = By.id("Email");
	private final By passwordTxt = By.id("Password");
	private final By loginButton = By.xpath("//input[@class='button-1 login-button']");
	private final By successfulLoginMessage = By.xpath("//p[text()='Welcome to the new Tricentis store!']");

	public String getLoginPageAssertion() {
		return driver.element().getText(loginPageAssertion);
	}

	public By getLoginPageAssertionLocator() {
		return loginPageAssertion;
	}

	public void EnterLoginData(String email, String password) {
		driver.element().type(emailTxt, email);
		driver.element().type(passwordTxt, password);
		driver.element().click(loginButton);
	}

	public String getSuccessfulMessageText() {
		return driver.element().getText(successfulLoginMessage);
	}
	
	public By successfulLoginAssertionLocator() {
		return successfulLoginMessage;
	}

}
