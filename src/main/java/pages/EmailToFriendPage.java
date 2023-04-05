package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class EmailToFriendPage {
	private SHAFT.GUI.WebDriver driver;

	public EmailToFriendPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By emailToFriendButton = By.xpath("//input[@value='Email a friend']");
	private final By emailPageAssertion = By.xpath("//h1[text()='Email a friend']");
	private final By friendEmailTxt = By.id("FriendEmail");
	private final By messageBox = By.id("PersonalMessage");
	private final By sendEmailButton = By.xpath("//input[@name='send-email']");
	private final By emailSentAssertion = By.xpath("//div[@class='result']");

	public void navigateToEmailToFriendPage() {
		driver.element().click(emailToFriendButton);
	}

	public String getEmailPageAssertion() {
		return driver.element().getText(emailPageAssertion);
	}

	public By getEmailPageAssertionLocator() {
		return emailPageAssertion;
	}

	public void sendMessage(String f_email, String message) {
		driver.element().type(friendEmailTxt, f_email);
		driver.element().type(messageBox, message);
		driver.element().click(sendEmailButton);
	}

	public String getEmailSentAssertionMessage() {
		return driver.element().getText(emailSentAssertion);
	}
	
	public By emailSentAssertionLocator() {
		return emailSentAssertion;
	}

}
