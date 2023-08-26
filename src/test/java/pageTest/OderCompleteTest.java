package pageTest;

import base.basePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.*;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OderCompleteTest extends basePage {
	public OderCompleteTest() throws IOException {
		super();
	}
	@BeforeTest
	public void setUp(){
		driver = getDriver();
		driver.get(getUrl());
	}
	@Test
	public void end2EndTest() throws InterruptedException, IOException {
		Homepage HPage = new Homepage(driver);
		Thread.sleep(1000);
		HPage.getCookies().click();
		Thread.sleep(1000);
		HPage.getToggle().click();
		Thread.sleep(2000);
		HPage.getTestStoreLink().click();
		Thread.sleep(1000);
		Productpage PPage = new Productpage(driver);
		PPage.getProduct1().click();
		Thread.sleep(1000);
		ProductDetailpage PDPage = new ProductDetailpage(driver);
		// interact with dropdown value
		Select option = new Select(PDPage.getSize());
		option.selectByVisibleText("L");
		PDPage.getIncre().click();
		PDPage.getCartBtn().click();
		Thread.sleep(3000);

		ShopContentPanel cPanel = new ShopContentPanel(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
		wait.until(ExpectedConditions.elementToBeClickable(cPanel.getProceedBtn()));
		cPanel.getProceedBtn().click();
		ShoppingCartpage cartPage = new ShoppingCartpage(driver);
		Thread.sleep(2000);
		cartPage.getPromoCode().click();
		Thread.sleep(2000);
		cartPage.getPromoTxtBox().sendKeys("20OFF");
		cartPage.addPromo().click();
		Thread.sleep(2000);
		cartPage.getCheckout().click();

		PersonalInfo custInfo = new PersonalInfo(driver);
		custInfo.getRadioBtn1().click();
		Thread.sleep(1000);
		custInfo.getFirstname().sendKeys("Wei-Chen");
		Thread.sleep(1000);
		custInfo.getLastname().sendKeys("Son");
		Thread.sleep(1000);
		custInfo.getMail().sendKeys("weichenson@test.com");
		Thread.sleep(2000);
		custInfo.getCheckBox3().click();
		Thread.sleep(2000);
		custInfo.getContBtn().click();

		AddressesPage addPage = new AddressesPage(driver);
		Thread.sleep(2000);
		addPage.getAdd().sendKeys("123 Main Street");
		Thread.sleep(1000);
		addPage.getCity().sendKeys("Y City");
		Thread.sleep(2000);
		Select opt = new Select(addPage.getState());
		opt.selectByVisibleText("Nevada");
		Thread.sleep(2000);
		addPage.getPostCode().sendKeys("12345");
		Thread.sleep(3000);
		addPage.getContBtn().click();

		ShippingMethod shipPer = new ShippingMethod(driver);
		Thread.sleep(1000);
		shipPer.getTextArea().sendKeys("If I am not in, pls leave the parcel outside the door.");
		Thread.sleep(2000);
		shipPer.getConstBtn().click();

		Payment payMen = new Payment(driver);
		Thread.sleep(1000);
		payMen.getWirePayment().click();
		Thread.sleep(1000);
		payMen.getAgreeTerm().click();
		Thread.sleep(2000);
		payMen.getAgreeBtn().click();
		Thread.sleep(3000);
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver = null;
	}
}
