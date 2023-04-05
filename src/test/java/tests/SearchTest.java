package tests;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends TestBase {

	SearchPage searchPage;

	@Test
	public void searchForProducts() {
		searchPage = new SearchPage(driver);
		searchPage.searchForFirstProductProduct("inch");
		driver.assertThat().element(searchPage.getAssertionMessageLocator()).text().contains("14.1-INCH LAPTOP").perform();
	}

}
