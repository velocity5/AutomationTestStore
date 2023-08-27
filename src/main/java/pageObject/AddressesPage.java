package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AddressesPage extends basePage {
	public WebDriver driver;

	By add = By.cssSelector("[name='address1']");
	By city = By.cssSelector("[name='city']");
	By state = By.cssSelector("[name='id_state']");
	By postCode = By.cssSelector("[name='postcode']");
	By contBtn = By.cssSelector("[name='confirm-addresses']");
	public AddressesPage() throws IOException {
		super();
	}
	public WebElement getAdd() throws IOException {
		this.driver = getDriver();
		return driver.findElement(add);
	}
	public WebElement getCity() throws IOException {
		this.driver = getDriver();
		return driver.findElement(city);
	}
	public WebElement getState() throws IOException {
		this.driver = getDriver();
		return driver.findElement(state);
	}
	public WebElement getPostCode() throws IOException {
		this.driver = getDriver();
		return driver.findElement(postCode);
	}
	public WebElement getContBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(contBtn);
	}
}
