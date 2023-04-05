package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
	HomePage home;
	ContactUsPage contactUsPage;
    SHAFT.TestData.JSON contactUsData; 
	@Test
	public void navigateToContactUs() {
		home = new HomePage(driver);
		home.navigateToContactUs();
	}

	@Test(priority = 1)
	public void contactUs() {
		contactUsData = new JSON("contactUsData.json");
		contactUsPage = new ContactUsPage(driver);
		contactUsPage.contactUsData(contactUsData.getTestData("name"),
				contactUsData.getTestData("email"), contactUsData.getTestData("message"));
		
		driver.assertThat().element(contactUsPage.getAssertionMessageLocator())
		.text().contains("Your enquiry has been successfully sent to the store owner.").perform();
	}

}
