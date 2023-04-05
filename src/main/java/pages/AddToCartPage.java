package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddToCartPage {
	private SHAFT.GUI.WebDriver driver;

	public AddToCartPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By addToCartButton = By.id("add-to-cart-button-31");
	private final By showCartButton = By.linkText("shopping cart");
	private final By firstProductAssertionMessage = By
			.xpath("//a[@class='product-name' and text()='14.1-inch Laptop']");
	private final By addToCartButton2 = By.id("add-to-cart-button-13");
	private final By secondProductAssertionMessage = By
			.xpath("//a[@class='product-name' and text()='Computing and Internet']");

	public void addFirstProductToCart() {
		driver.element().click(addToCartButton);
		driver.element().click(showCartButton);
	}

	public String getFirstProductAssertionMessage() {
		return driver.element().getText(firstProductAssertionMessage);
	}
	
	public By getFirstProductAssertionMessageLocator() {
		return firstProductAssertionMessage;
	}

	public void addSecondProductToCart() {
		driver.element().click(addToCartButton2);
		driver.element().click(showCartButton);
	}

	public String getSecondProductAssertionMessage() {
		return driver.element().getText(secondProductAssertionMessage);
	}
	
	public By getSecondProductAssertionMessageLocator() {
		return secondProductAssertionMessage;
	}

}
