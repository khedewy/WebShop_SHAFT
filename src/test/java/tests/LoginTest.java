package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class LoginTest extends TestBase {

	HomePage home;
	RegisterPage registerPage;
	String currentTime = String.valueOf(System.currentTimeMillis());
	SHAFT.TestData.JSON registerData;
	LoginPage log;

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
	public void logOut() {
		home = new HomePage(driver);
		home.logout();
	}

	@Test(priority = 4)
	public void Login() {

		registerData = new JSON("registerData.json");
		home = new HomePage(driver);
		home.navigateToLoginPage();
		log = new LoginPage(driver);
		driver.assertThat().element(log.getLoginPageAssertionLocator()).text().contains("Welcome, Please Sign In!")
				.perform();
		log.EnterLoginData(registerData.getTestData("email") + currentTime + "@gmail.com",
				registerData.getTestData("password"));
		driver.assertThat().element(log.successfulLoginAssertionLocator()).text()
				.contains("Welcome to the new Tricentis store!").perform();
	}

}
