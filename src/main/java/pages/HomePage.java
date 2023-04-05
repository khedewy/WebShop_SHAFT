package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class HomePage {
	private SHAFT.GUI.WebDriver driver;

	public HomePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By registerBtn = By.linkText("Register");
	private final By logoutButton = By.linkText("Log out");
	private final By loginButton = By.linkText("Log in");
	private final By contactUsBtn = By.xpath("//a[@href='/contactus']");

	public RegisterPage navigateToRegisterPage() {
		driver.element().click(registerBtn);
		return new RegisterPage(driver);
	}

	public void logout() {
		driver.element().click(logoutButton);
	}

	public LoginPage navigateToLoginPage() {
		driver.element().click(loginButton);
		return new LoginPage(driver);
	}

	public ContactUsPage navigateToContactUs() {
		driver.element().click(contactUsBtn);
		return new ContactUsPage(driver);
	}

}
