package pageObject;

import base.basePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class PersonalInfo extends basePage {
	WebDriver driver;
	By RadioMr = By.cssSelector("[class] .radio-inline:nth-of-type(1)");
	By RadioMrs = By.cssSelector("[class] .radio-inline:nth-of-type(2)");
	By FirstName = By.cssSelector("[name='firstname']");
	By LastName = By.cssSelector("[name='lastname']");
	By Email = By.xpath("//input[contains(@name,\"email\") and @type=\"email\"]");
	By Checkbox1 = By.xpath("//input[contains(@name,\"optin\")]");
	By Checkbox2 = By.xpath("//input[contains(@name,\"news\")]");
	By Checkbox3 = By.xpath("//input[contains(@name,\"ps\")]");

	By ContBtn = By.cssSelector("form#customer-form  button[name='continue']");

	public PersonalInfo () throws IOException {
		super();
	}
	public WebElement getRadioBtn1() throws IOException {
		this.driver = getDriver();
		return driver.findElement(RadioMr);
	}
	public WebElement getRadioBtn2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(RadioMrs);
	}
	public WebElement getFirstname() throws IOException {
		this.driver = getDriver();
		return driver.findElement(FirstName);
	}
	public WebElement getLastname() throws IOException {
		this.driver = getDriver();
		return driver.findElement(LastName);
	}
	public WebElement getMail() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Email);
	}
	public WebElement getCheckBox1() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Checkbox1);
	}
	public WebElement getCheckBox2() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Checkbox2);
	}
	public WebElement getCheckBox3() throws IOException {
		this.driver = getDriver();
		return driver.findElement(Checkbox3);
	}
	public WebElement getContBtn() throws IOException {
		this.driver = getDriver();
		return driver.findElement(ContBtn);
	}
}
