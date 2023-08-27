package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ProductDetailpage extends basePage {
	public WebDriver driver;
	By selectSize = By.cssSelector("select#group_1");
	By selectDimension = By.cssSelector("select#group_3");
	By increQttBtn = By.xpath("//button[contains(@class,\"touchspin-up\")]");
	By decreQttBtn = By.xpath("//button[contains(@class,\"touchspin-down\")]");
	By backHome = By.xpath("//*[@itemprop=\"name\" and text()=\"Home\"]");
	By AddCartBtn = By.xpath("//button[contains(@class,\"add\")]");


	public ProductDetailpage() throws IOException {
		super();
	}
	public WebElement getSize() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectSize);
	}
	public WebElement getDim() throws IOException {
		this.driver = getDriver();
		return driver.findElement(selectDimension);
	}
	public WebElement getIncre() throws IOException {
		this.driver = getDriver();
		return driver.findElement(increQttBtn);
	}
	public WebElement getDecre() throws IOException {
		this.driver = getDriver();
		return driver.findElement(decreQttBtn);
	}
	public WebElement getBackHome() throws IOException {
		this.driver = getDriver();
		return driver.findElement(backHome);
	}
	public WebElement getCartBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(AddCartBtn);
	}

}
