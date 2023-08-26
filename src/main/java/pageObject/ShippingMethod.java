package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingMethod {
	WebDriver driver;
	By txtArea = By.cssSelector("#delivery_message");
	By contBtn = By.cssSelector("[name='confirmDeliveryOption']");
	public ShippingMethod(WebDriver driver){
		this.driver = driver;
	}
	public WebElement getTextArea(){
		return driver.findElement(txtArea);
	}
	public WebElement getConstBtn(){
		return driver.findElement(contBtn);
	}
}
