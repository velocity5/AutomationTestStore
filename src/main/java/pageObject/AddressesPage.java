package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesPage {
	public WebDriver driver;

	By add = By.cssSelector("[name='address1']");
	By city = By.cssSelector("[name='city']");
	By state = By.cssSelector("[name='id_state']");
	By postCode = By.cssSelector("[name='postcode']");
	By contBtn = By.cssSelector("[name='confirm-addresses']");
	public AddressesPage(WebDriver driver){
		this.driver = driver;
	}
	public WebElement getAdd(){
		return driver.findElement(add);
	}
	public WebElement getCity(){
		return driver.findElement(city);
	}
	public WebElement getState(){
		return driver.findElement(state);
	}
	public WebElement getPostCode(){
		return driver.findElement(postCode);
	}
	public WebElement getContBtn(){
		return driver.findElement(contBtn);
	}
}
