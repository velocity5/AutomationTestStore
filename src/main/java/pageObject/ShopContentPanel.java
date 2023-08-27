package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends basePage {
	public WebDriver driver;
	By contShoppingBtn = By.xpath("//button[contains(text(),\"Continue\")]");
	By proceedBtn = By.xpath("//*[contains(text(),\"Proceed\")]");
	public ShopContentPanel() throws IOException {
		super();
	}
	public WebElement getContBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contShoppingBtn);
	}
	public WebElement getProceedBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(proceedBtn);
	}
}
