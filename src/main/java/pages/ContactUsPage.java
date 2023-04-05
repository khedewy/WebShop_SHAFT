package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ContactUsPage {
	private SHAFT.GUI.WebDriver driver;

	public ContactUsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By nameTxt = By.id("FullName");
	private final By emailTxt = By.id("Email");
	private final By messageTxt = By.id("Enquiry");
	private final By submitButton = By.name("send-email");
	private final By AssertionMessage = By.xpath("//div[@class='result']");

	public void contactUsData(String name, String email, String message) {
		driver.element().type(nameTxt, name);
		driver.element().type(emailTxt, email);
		driver.element().type(messageTxt, message);
		driver.element().click(submitButton);
	}

	public String getAssertionMessage() {
		return driver.element().getText(AssertionMessage);
	}

	public By getAssertionMessageLocator() {
		return AssertionMessage;
	}

}
