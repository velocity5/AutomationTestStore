package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShippingMethod extends basePage {
	WebDriver driver;
	By txtArea = By.cssSelector("#delivery_message");
	By contBtn = By.cssSelector("[name='confirmDeliveryOption']");
	public ShippingMethod() throws IOException {
		super();
	}
	public WebElement getTextArea() throws IOException {
		this.driver = getDriver();
		return driver.findElement(txtArea);
	}
	public WebElement getConstBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contBtn);
	}
}
