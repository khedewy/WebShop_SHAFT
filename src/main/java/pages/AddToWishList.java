package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class AddToWishList {
	private SHAFT.GUI.WebDriver driver;

	public AddToWishList(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By addToWishListButton = By.id("add-to-wishlist-button-43");
	private final By showWishList = By.linkText("wishlist");
	private final By AssertionMessage = By.xpath("//a[@href='/smartphone' and text()='Smartphone']");

	public void addToWishList() {
		driver.element().click(addToWishListButton);
		driver.element().click(showWishList);
	}

	public String getAssertionMessage() {
		return driver.element().getText(AssertionMessage);

	}

	public By getAssertionMessageLocator() {
		return AssertionMessage;
	}

}
