package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingCartpage extends basePage {
	public WebDriver driver;
	By promoCode = By.linkText("Have a promo code?");
	By promoTxtBox = By.cssSelector("input[name='discount_name']");
	By addPromoBtn = By.xpath("//span[text()=\"Add\"]");
	By delProduct1 = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By delProduct2 = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalAmt = By.cssSelector(".cart-total .value");
	By checkOut = By.linkText("PROCEED TO CHECKOUT");
	public ShoppingCartpage () throws IOException {
		super();
	}
	public WebElement getPromoCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoCode);
	}
	public WebElement getPromoTxtBox() throws IOException {
		this.driver = getDriver();
		return driver.findElement(promoTxtBox);
	}
	public WebElement addPromo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(addPromoBtn);
	}
	public WebElement delProductOne() throws IOException {
		this.driver = getDriver();
		return driver.findElement(delProduct1);
	}
	public WebElement delProductTwo() throws IOException {
		this.driver = getDriver();
		return driver.findElement(delProduct2);
	}
	public WebElement getTotalAmt() throws IOException {
		this.driver = getDriver();
		return driver.findElement(totalAmt);
	}
	public WebElement getCheckout() throws IOException {
		this.driver = getDriver();
		return driver.findElement(checkOut);
	}
}
