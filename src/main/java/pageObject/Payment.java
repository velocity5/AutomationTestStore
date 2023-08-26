package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {
	WebDriver driver;
	By paymentOne = By.cssSelector("[for='payment-option-1'] span");
	By paymentTwo = By.cssSelector("[for='payment-option-2'] span");
	By agreeTerm = By.xpath("//*[contains(@for,\"conditions\")]");
	By agreeBtn = By.xpath("//*[contains(text(),\"Order with\")]");

	public Payment(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getCheckPayment(){
		return driver.findElement(paymentOne);
	}
	public WebElement getWirePayment(){
		return driver.findElement(paymentTwo);
	}
	public WebElement getAgreeTerm(){
		return driver.findElement(agreeTerm);
	}
	public WebElement getAgreeBtn(){
		return driver.findElement(agreeBtn);
	}
}
