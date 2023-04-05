package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ComputerPage {
	private SHAFT.GUI.WebDriver driver;

	public ComputerPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By computers = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a");
	private final By desktops = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[1]/a");
	private final By notebooks = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a");
	private final By DesktopsAssertionMessage = By.xpath("//strong[@class='current-item']");
	private final By notebooksAssertionMessage = By.xpath("//h1[text()='Notebooks']");

	public void HoverOverComputers() {
		driver.element().hover(computers);
	}

	public void hoverOverDesktops() {
		driver.element().hover(desktops).click(desktops);
	}

	public void hoverOverNotebooks() {
		driver.element().hover(notebooks).click(notebooks);
	}

	public String getDesktopAssertionMessage() {
		return driver.element().getText(DesktopsAssertionMessage);
	}
	
	public By DesktiopAssertionMessageLocator() {
		return DesktopsAssertionMessage;
	}
	

	public String getNotebooksAssertionMessage() {
		return driver.element().getText(notebooksAssertionMessage);
	}
	
	public By getNoteBooksAssertionMessageLocator() {
		return notebooksAssertionMessage;
	}

}
