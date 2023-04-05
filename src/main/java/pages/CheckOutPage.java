package pages;

import org.openqa.selenium.By;

import com.shaft.driver.SHAFT;

public class CheckOutPage {
	private SHAFT.GUI.WebDriver driver;

	public CheckOutPage(SHAFT.GUI.WebDriver driver) {
		this.driver = driver;
	}

	private final By servicesBtn = By.id("termsofservice");
	private final By checkoutButton = By.id("checkout");
	private final By guestOption = By.xpath("//input[@class='button-1 checkout-as-guest-button']");
	private final By firstNameTxt = By.id("BillingNewAddress_FirstName");
	private final By lastNameTxt = By.id("BillingNewAddress_LastName");
	private final By emailTxt = By.id("BillingNewAddress_Email");
	private final By companyTxt = By.id("BillingNewAddress_Company");
	private final By countryTxt = By.id("BillingNewAddress_CountryId");
	private final By cityTxt = By.id("BillingNewAddress_City");
	private final By address1Txt = By.id("BillingNewAddress_Address1");
	private final By address2Txt = By.id("BillingNewAddress_Address2");
	private final By zipTxt = By.id("BillingNewAddress_ZipPostalCode");
	private final By phoneTxt = By.id("BillingNewAddress_PhoneNumber");
	private final By faxNumber = By.id("BillingNewAddress_FaxNumber");
	private final By continueBtn = By.xpath("//*[@id=\"billing-buttons-container\"]/input");
	private final By shippingButton = By.xpath("//*[@id=\"shipping-buttons-container\"]/input");
	private final By shippingMethode = By.xpath("//input[@onclick='ShippingMethod.save()']");
	private final By paymentMethode = By.xpath("//input[@onclick='PaymentMethod.save()']");
	private final By paymentInformation = By.xpath("//input[@onclick='PaymentInfo.save()']");
	private final By confirmationButton = By.xpath("//input[@onclick='ConfirmOrder.save()']");
	private final By assertionMessage = By.xpath("//strong[text()='Your order has been successfully processed!']");

	public void AgreeOnServices() {
		driver.element().click(servicesBtn);
	}

	public void navigateToCheckout() {
		driver.element().click(checkoutButton);
		driver.element().click(guestOption);
	}

	public void enterAddressData(String firstName, String lastName, String email, String company, String country,
			String city, String address1, String address2, String zip, String phone, String fax) {

		driver.element().type(firstNameTxt, firstName);
		driver.element().type(lastNameTxt, lastName);
		driver.element().type(emailTxt, email);
		driver.element().type(companyTxt, company);
		driver.element().select(countryTxt, country);
		driver.element().type(cityTxt, city);
		driver.element().type(address1Txt, address1);
		driver.element().type(address2Txt, address2);
		driver.element().type(zipTxt, zip);
		driver.element().type(phoneTxt, phone);
		driver.element().type(faxNumber, fax);
		driver.element().click(continueBtn);
	}

	public void clickShippingButton() {
		driver.element().click(shippingButton);
	}

	public void navigateToShippingMethode() {
		driver.element().click(shippingMethode);
	}

	public void navigateToPaymentMethode() {
		driver.element().click(paymentMethode);
	}

	public void navigateToPaymentInformation() {
		driver.element().click(paymentInformation);
	}

	public void confirmOrder() {
		driver.element().click(confirmationButton);
	}

	public String getAssertionMessage() {
		return driver.element().getText(assertionMessage);
	}

	public By getAssertionMessageLocator() {
		return assertionMessage;
	}

}
