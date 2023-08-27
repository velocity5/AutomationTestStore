package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Payment extends basePage {
	WebDriver driver;
	By paymentOne = By.cssSelector("[for='payment-option-1'] span");
	By paymentTwo = By.cssSelector("[for='payment-option-2'] span");
	By agreeTerm = By.xpath("//*[contains(@for,\"conditions\")]");
	By agreeBtn = By.xpath("//*[contains(text(),\"Order with\")]");

	public Payment() throws IOException {
		super();
	}
	public WebElement getCheckPayment() throws IOException {
		this.driver = getDriver();
		return driver.findElement(paymentOne);
	}
	public WebElement getWirePayment() throws IOException {
		this.driver = getDriver();
		return driver.findElement(paymentTwo);
	}
	public WebElement getAgreeTerm() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agreeTerm);
	}
	public WebElement getAgreeBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(agreeBtn);
	}
}
