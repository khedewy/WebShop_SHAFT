package tests;

import org.testng.annotations.Test;

import pages.ElectronicsPage;

public class HoverOverElectronics extends TestBase {

	ElectronicsPage electronicsPage;

	@Test
	public void HoverOverCameras() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.HoverOverElectronics();
		electronicsPage.hoverOverCamera();
		driver.assertThat().element(electronicsPage.cameraAssertionLocator()).text().contains("Camera, photo").perform();
	}

	@Test(priority = 1)
	public void HoverOverCellPhones() {
		electronicsPage = new ElectronicsPage(driver);
		electronicsPage.HoverOverElectronics();
		electronicsPage.hoverOverCellPhones();
		driver.assertThat().element(electronicsPage.cellPhoneAssertionMessageLocator()).text().contains("Cell phones").perform();
	}

}
