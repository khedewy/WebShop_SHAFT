package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class SearchPage {
	private SHAFT.GUI.WebDriver driver;

	public SearchPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By searchBox = By.id("small-searchterms");
	private final By FirstProductResults = By.id("ui-id-2");
	private final By secondSearchResults = By.id("ui-id-9");
	private final By AssertionMessage = By.xpath("//strong[@class='current-item']");

	public void searchForFirstProductProduct(String product) {
		driver.element().type(searchBox, product);
		driver.element().click(FirstProductResults);
	}

	public String getAssertionMessage() {
		return driver.element().getText(AssertionMessage);
	}
	
	public By getAssertionMessageLocator() {
		return AssertionMessage;
	}

	public void searchForSecondProduct(String product) {
		driver.element().type(searchBox, product);
		driver.element().click(secondSearchResults);
	}

}
