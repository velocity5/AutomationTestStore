package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalInfo {
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

	public PersonalInfo (WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getRadioBtn1(){
		return driver.findElement(RadioMr);
	}
	public WebElement getRadioBtn2(){
		return driver.findElement(RadioMrs);
	}
	public WebElement getFirstname(){
		return driver.findElement(FirstName);
	}
	public WebElement getLastname(){
		return driver.findElement(LastName);
	}
	public WebElement getMail(){
		return driver.findElement(Email);
	}
	public WebElement getCheckBox1(){
		return driver.findElement(Checkbox1);
	}
	public WebElement getCheckBox2(){
		return driver.findElement(Checkbox2);
	}
	public WebElement getCheckBox3(){
		return driver.findElement(Checkbox3);
	}
	public WebElement getContBtn(){
		return driver.findElement(ContBtn);
	}
}
