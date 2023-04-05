package tests;

import org.testng.annotations.Test;

import pages.AddToComparePage;
import pages.ElectronicsPage;

public class AddToCompareTest extends TestBase {
	ElectronicsPage electronicsPage;
	AddToComparePage add;

	@Test
	public void HoverOverCellPhones() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.HoverOverElectronics();
		electronicsPage.hoverOverCellPhones();
		driver.assertThat().element(electronicsPage.cellPhoneAssertionMessageLocator()).text().contains("Cell phones").perform();
	}

	@Test(priority = 1)
	public void goToChosenProductPage() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.navigateToChosenProduct();
	}

	@Test(priority = 2)
	public void addToCompareList() {
		add = new AddToComparePage(driver);
		add.addToCompareList();
		driver.assertThat().element(add.getAssertionMessageLocator()).text().contains("Smartphone").perform();
	}

}
