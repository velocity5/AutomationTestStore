package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {
	public WebDriver driver;
	By contShoppingBtn = By.xpath("//button[contains(text(),\"Continue\")]");
	By proceedBtn = By.xpath("//*[contains(text(),\"Proceed\")]");
	public ShopContentPanel(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getContBtn(){
		return driver.findElement(contShoppingBtn);
	}
	public WebElement getProceedBtn(){
		return driver.findElement(proceedBtn);
	}
}
