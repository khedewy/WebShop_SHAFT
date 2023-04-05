package tests;

import org.testng.annotations.Test;

import pages.AddToWishList;
import pages.ElectronicsPage;

public class AddToWishListTest extends TestBase {

	ElectronicsPage electronicsPage;
	AddToWishList add;

	@Test
	public void HoverOverCellPhones() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.HoverOverElectronics();
		electronicsPage.hoverOverCellPhones();
		driver.assertThat().element(electronicsPage.cellPhoneAssertionMessageLocator()).text().contains("Cell phones")
				.perform();
	}

	@Test(priority = 1)
	public void goToChosenProductPage() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.navigateToChosenProduct();
	}

	@Test(priority = 2)
	public void addProductToWishList() {
		add = new AddToWishList(driver);
		add.addToWishList();
		driver.assertThat().element(add.getAssertionMessageLocator()).text().contains("Smartphone")
				.perform();

	}

}
