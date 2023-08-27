package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Productpage extends basePage {
	public WebDriver driver;
	By product1ne = By.cssSelector("[alt='Hummingbird printed t-shirt']");
	By product2wo = By.cssSelector("[alt='Brown bear printed sweater']");
	By productThr3e = By.linkText("The Best Is Yet To Come'...");
	By product4our = By.linkText("The Adventure Begins Framed...");
	By product5vie = By.linkText("Today Is A Good Day Framed...");
	By product6ix = By.linkText("Mug The Best Is Yet To Come");
	By product7evn = By.linkText("Mug The Adventure Begins");
	By productEi8ht = By.linkText("Mug Today Is A Good Day");

	public Productpage() throws IOException {
		super();
	}
	public WebElement getProduct1() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product1ne);
	}
	public WebElement getProduct2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product2wo);
	}
	public WebElement getProduct3() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productThr3e);
	}
	public WebElement getProduct4() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product4our);
	}
	public WebElement getProduct5() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product5vie);
	}
	public WebElement getProduct6() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product6ix);
	}
	public WebElement getProduct7() throws IOException {
		this.driver = getDriver();
		return driver.findElement(product7evn);
	}
	public WebElement getProduct8() throws IOException {
		this.driver = getDriver();
		return driver.findElement(productEi8ht);
	}
}
