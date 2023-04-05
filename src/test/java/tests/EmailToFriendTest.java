package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.ElectronicsPage;
import pages.EmailToFriendPage;
import pages.HomePage;
import pages.RegisterPage;

public class EmailToFriendTest extends TestBase {

	HomePage home;
	RegisterPage registerPage;
	String currentTime = String.valueOf(System.currentTimeMillis());
	SHAFT.TestData.JSON registerData;
	ElectronicsPage electronicsPage;
	EmailToFriendPage email;
	SHAFT.TestData.JSON emailToFriendData;

	@Test
	public void navigateToRegister() {
		home = new HomePage(driver);
		home.navigateToRegisterPage();
		registerPage = new RegisterPage(driver);
		driver.assertThat().element(registerPage.getRegisterAssertionLocator()).text().contains("Register").perform();
	}

	@Test(priority = 2)
	public void completeRegister() {
		registerData = new JSON("registerData.json");
		registerPage = new RegisterPage(driver);
		registerPage.EnterUserData(registerData.getTestData("firstName"), registerData.getTestData("lastName"),
				registerData.getTestData("email") + currentTime + "@gmail.com", registerData.getTestData("password"));
		driver.assertThat().element(registerPage.sucessfullRgisterLocator()).text()
				.contains("Your registration completed").perform();
	}

	@Test(priority = 3)
	public void HoverOverCellPhones() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.HoverOverElectronics();
		electronicsPage.hoverOverCellPhones();
		driver.assertThat().element(electronicsPage.cellPhoneAssertionMessageLocator()).text().contains("Cell phones")
				.perform();
	}

	@Test(priority = 4)
	public void goToChosenProductPage() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.navigateToChosenProduct();
	}

	@Test(priority = 5)
	public void goToEmailFriendPage() {
		email = new EmailToFriendPage(driver);
		email.navigateToEmailToFriendPage();
		driver.assertThat().element(email.getEmailPageAssertionLocator()).text().contains("Email a friend").perform();
	}

	@Test(priority = 6)
	public void sendEmailToFriend() {
		emailToFriendData = new JSON("emailToFriendData.json");
		email = new EmailToFriendPage(driver);
		email.sendMessage(emailToFriendData.getTestData("friendEmail"), emailToFriendData.getTestData("Message"));
		driver.assertThat().element(email.emailSentAssertionLocator()).text().contains("Your message has been sent.")
				.perform();
	}

}
