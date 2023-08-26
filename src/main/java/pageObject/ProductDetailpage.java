package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailpage {
	public WebDriver driver;
	By selectSize = By.cssSelector("select#group_1");
	By selectDimension = By.cssSelector("select#group_3");
	By increQttBtn = By.xpath("//button[contains(@class,\"touchspin-up\")]");
	By decreQttBtn = By.xpath("//button[contains(@class,\"touchspin-down\")]");
	By backHome = By.xpath("//*[@itemprop=\"name\" and text()=\"Home\"]");
	By AddCartBtn = By.xpath("//button[contains(@class,\"add\")]");


	public ProductDetailpage(WebDriver driver){
		this.driver = driver;
	}
	public WebElement getSize(){
		return driver.findElement(selectSize);
	}
	public WebElement getDim(){
		return driver.findElement(selectDimension);
	}
	public WebElement getIncre(){
		return driver.findElement(increQttBtn);
	}
	public WebElement getDecre(){
		return driver.findElement(decreQttBtn);
	}
	public WebElement getBackHome(){
		return driver.findElement(backHome);
	}
	public WebElement getCartBtn(){
		return driver.findElement(AddCartBtn);
	}

}
