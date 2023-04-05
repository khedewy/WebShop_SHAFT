package tests;

import org.testng.annotations.Test;

import com.shaft.driver.SHAFT;
import com.shaft.driver.SHAFT.TestData.JSON;

import pages.AddToCartPage;
import pages.CheckOutPage;
import pages.SearchPage;

public class CheckOutTest extends TestBase {

	SearchPage searchPage;
	AddToCartPage add;
	CheckOutPage check;
	SHAFT.TestData.JSON  checkData;

	@Test
	public void searchForProducts() {
		searchPage = new SearchPage(driver);
		searchPage.searchForFirstProductProduct("inch");
		driver.assertThat().element(searchPage.getAssertionMessageLocator()).text().contains("14.1-INCH LAPTOP")
				.perform();
	}

	@Test(priority = 1)
	public void addFirstProductToCart() {
		add = new AddToCartPage(driver);
		add.addFirstProductToCart();
		driver.assertThat().element(add.getFirstProductAssertionMessageLocator()).text().contains("14.1-inch Laptop")
				.perform();
	}

	@Test(priority = 2)
	public void searchForSecondProduct() {
		searchPage = new SearchPage(driver);
		searchPage.searchForFirstProductProduct("computing");
		driver.assertThat().element(searchPage.getAssertionMessageLocator()).text().contains("COMPUTING AND INTERNET")
				.perform();
	}

	@Test(priority = 3)
	public void addSecondProductToCart() {
		add = new AddToCartPage(driver);
		add.addSecondProductToCart();
		driver.assertThat().element(add.getSecondProductAssertionMessageLocator()).text()
				.contains("Computing and Internet").perform();
	}

	@Test(priority = 4)
	public void agreeOnServices() {
		check = new CheckOutPage(driver);
		check.AgreeOnServices();
	}

	@Test(priority = 5)
	public void navigateToCheckout() {
		check = new CheckOutPage(driver);
		check.navigateToCheckout();
	}

	@Test(priority = 6)
	public void enterAddressData(){
		checkData = new JSON("checkoutData.json");
		check = new CheckOutPage(driver);
		check.enterAddressData(checkData.getTestData("firstName"), checkData.getTestData("lastName"),checkData.getTestData("email")
				, checkData.getTestData("company"), checkData.getTestData("country"), checkData.getTestData("city"),
				checkData.getTestData("address1"),checkData.getTestData("address2"), checkData.getTestData("zip"),
				checkData.getTestData("phone"),checkData.getTestData("fax"));
	}

	@Test(priority = 7)
	public void navigateToShipping() {
		check = new CheckOutPage(driver);
		check.clickShippingButton();
	}

	@Test(priority = 8)
	public void navigateToShippingMethode() {
		check = new CheckOutPage(driver);
		check.navigateToShippingMethode();
	}

	@Test(priority = 9)
	public void navigateToShippingPayment() {
		check = new CheckOutPage(driver);
		check.navigateToPaymentMethode();
	}

	@Test(priority = 10)
	public void navigateToPaymentInformation() {
		check = new CheckOutPage(driver);
		check.navigateToPaymentInformation();
	}

	@Test(priority = 11)
	public void confirmOrder() {
		check = new CheckOutPage(driver);
		check.confirmOrder();
		driver.assertThat().element(check.getAssertionMessageLocator())
		.text().contains("Your order has been successfully processed!").perform();;
	}

}
