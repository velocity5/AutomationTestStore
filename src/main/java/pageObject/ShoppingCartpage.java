package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartpage {
	public WebDriver driver;
	By promoCode = By.linkText("Have a promo code?");
	By promoTxtBox = By.cssSelector("input[name='discount_name']");
	By addPromoBtn = By.xpath("//span[text()=\"Add\"]");
	By delProduct1 = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
	By delProduct2 = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
	By totalAmt = By.cssSelector(".cart-total .value");
	By checkOut = By.linkText("PROCEED TO CHECKOUT");
	public ShoppingCartpage (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getPromoCode(){
		return driver.findElement(promoCode);
	}
	public WebElement getPromoTxtBox(){
		return driver.findElement(promoTxtBox);
	}
	public WebElement addPromo(){
		return driver.findElement(addPromoBtn);
	}
	public WebElement delProductOne(){
		return driver.findElement(delProduct1);
	}
	public WebElement delProductTwo(){
		return driver.findElement(delProduct2);
	}
	public WebElement getTotalAmt(){
		return driver.findElement(totalAmt);
	}
	public WebElement getCheckout(){
		return driver.findElement(checkOut);
	}
}
