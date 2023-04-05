package tests;

import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.SearchPage;

public class AddToCartTest extends TestBase {

	SearchPage searchPage;
	AddToCartPage add;

	@Test
	public void searchForProducts() {
		searchPage = new SearchPage(driver);
		searchPage.searchForFirstProductProduct("inch");
		driver.assertThat().element(searchPage.getAssertionMessageLocator()).text().contains("14.1-INCH LAPTOP").perform();
	}

	@Test(priority = 1)
	public void addFirstProductToCart() {
		add = new AddToCartPage(driver);
		add.addFirstProductToCart();
		driver.assertThat().element(add.getFirstProductAssertionMessageLocator()).text().contains("14.1-inch Laptop").perform();
	}

	@Test(priority = 2)
	public void searchForSecondProduct() {
		searchPage = new SearchPage(driver);
		searchPage.searchForFirstProductProduct("computing");
		driver.assertThat().element(searchPage.getAssertionMessageLocator()).text().contains("COMPUTING AND INTERNET").perform();
	}

	@Test(priority = 3)
	public void addSecondProductToCart() {
		add = new AddToCartPage(driver);
		add.addSecondProductToCart();
		driver.assertThat().element(add.getSecondProductAssertionMessageLocator()).text().contains("Computing and Internet").perform();
	}

}
