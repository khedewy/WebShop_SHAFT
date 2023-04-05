package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.HomePage;
import pages.RegisterPage;

public class RegisterTest extends TestBase {

	HomePage home;
	RegisterPage registerPage;
	String currentTime = String.valueOf(System.currentTimeMillis());
	SHAFT.TestData.JSON registerData;

	
	@Test
	public void navigateToRegister() {
		home = new HomePage(driver);
		home.navigateToRegisterPage();
		registerPage = new RegisterPage(driver);
		driver.assertThat().element(registerPage.getRegisterAssertionLocator()).text().contains("Register").perform();
	}

	@Test(priority = 2)
	public void completeRegister(){
		registerData = new JSON("registerData.json");
		registerPage = new RegisterPage(driver);
		registerPage.EnterUserData(registerData.getTestData("firstName"),
				registerData.getTestData("lastName"), registerData.getTestData("email") + currentTime + "@gmail.com",
				registerData.getTestData("password"));
		driver.assertThat().element(registerPage.sucessfullRgisterLocator()).text().contains("Your registration completed").perform();
	}

}
