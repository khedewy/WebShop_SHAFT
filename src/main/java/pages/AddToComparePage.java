package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddToComparePage {
	private SHAFT.GUI.WebDriver driver;

	public AddToComparePage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By addToCompareButton = By.xpath("//input[@class='button-2 add-to-compare-list-button']");
	private final By AssertionMessage = By.xpath("//a[@href='/smartphone' and text()='Smartphone']");

	public void addToCompareList() {
		driver.element().click(addToCompareButton);
	}

	public String getAssertionMessage() {
		return driver.element().getText(AssertionMessage);
	}
	
	public By getAssertionMessageLocator() {
		return AssertionMessage;
	}

}
