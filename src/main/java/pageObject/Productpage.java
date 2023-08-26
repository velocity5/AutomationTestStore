package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Productpage {
	public WebDriver driver;
	By product1ne = By.cssSelector("[alt='Hummingbird printed t-shirt']");
	By product2wo = By.cssSelector("[alt='Brown bear printed sweater']");
	By productThr3e = By.linkText("The Best Is Yet To Come'...");
	By product4our = By.linkText("The Adventure Begins Framed...");
	By product5vie = By.linkText("Today Is A Good Day Framed...");
	By product6ix = By.linkText("Mug The Best Is Yet To Come");
	By product7evn = By.linkText("Mug The Adventure Begins");
	By productEi8ht = By.linkText("Mug Today Is A Good Day");

	public Productpage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getProduct1(){
		return driver.findElement(product1ne);
	}
	public WebElement getProduct2(){
		return driver.findElement(product2wo);
	}
	public WebElement getProduct3(){
		return driver.findElement(productThr3e);
	}
	public WebElement getProduct4(){
		return driver.findElement(product4our);
	}
	public WebElement getProduct5(){
		return driver.findElement(product5vie);
	}
	public WebElement getProduct6(){
		return driver.findElement(product6ix);
	}
	public WebElement getProduct7(){
		return driver.findElement(product7evn);
	}
	public WebElement getProduct8(){
		return driver.findElement(productEi8ht);
	}
}
