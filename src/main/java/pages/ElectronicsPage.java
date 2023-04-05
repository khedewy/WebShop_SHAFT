package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class ElectronicsPage {
	private SHAFT.GUI.WebDriver driver;

	public ElectronicsPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By electronics = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a");
	private final By camera = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[1]/a");
	private final By CameraAssertion = By.xpath("//h1[text()='Camera, photo']");
	private final By cellPhones = By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/ul/li[2]/a");
	private final By cellPhonesAssertion = By.xpath("//h1[text()='Cell phones']");
	private final By chosenProduct = By.linkText("Smartphone");

	public void HoverOverElectronics() {
		driver.element().hover(electronics);
	}

	public void hoverOverCamera() {
		driver.element().hover(camera).click(camera);
	}

	public String getCameraAssertionMessage() {

		return driver.element().getText(CameraAssertion);
	}

	public By cameraAssertionLocator() {
		return CameraAssertion;
	}

	public void hoverOverCellPhones() {
		driver.element().hover(cellPhones).click(cellPhones);
	}

	public String getCellPhonesAssertionMessage() {

		return driver.element().getText(cellPhonesAssertion);
	}
	
	public By cellPhoneAssertionMessageLocator() {
		return cellPhonesAssertion;
	}

	public void navigateToChosenProduct() {
		driver.element().click(chosenProduct);
	}

}
