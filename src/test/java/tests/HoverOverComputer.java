package tests;

import org.testng.annotations.Test;

import pages.ComputerPage;

public class HoverOverComputer extends TestBase {
	ComputerPage computerPage;

	@Test
	public void HoverOverDesktops() {
		computerPage = new ComputerPage(driver);
		computerPage.HoverOverComputers();
		computerPage.hoverOverDesktops();
		driver.assertThat().element(computerPage.DesktiopAssertionMessageLocator()).text().contains("DESKTOPS").perform();
	}

	@Test(priority = 1)
	public void HoverOverNotebooks() {
		computerPage = new ComputerPage(driver);
		computerPage.HoverOverComputers();
		computerPage.hoverOverNotebooks();
		driver.assertThat().element(computerPage.getNoteBooksAssertionMessageLocator()).text().contains("Notebooks").perform();
		
	}

}
