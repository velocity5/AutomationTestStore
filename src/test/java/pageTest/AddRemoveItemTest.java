package pageTest;

import base.basePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.*;

import java.io.IOException;


import java.time.Duration;
@Listeners(ListenToFail.Listeners.class)

public class AddRemoveItemTest extends basePage {

	public AddRemoveItemTest() throws IOException {
		super();
	}
	@BeforeTest
	public void setUp(){
		driver = getDriver();
		driver.get(getUrl());
	}
	@Test
	public void end2EndTest() throws InterruptedException, IOException {
		Homepage Hpage = new Homepage(driver);
		Hpage.getCookies().click();
		Thread.sleep(1000);
		Hpage.getToggle().click();
		Thread.sleep(1000);
		Hpage.getTestStoreLink().click();
		Thread.sleep(2000);

		Productpage pPage = new Productpage(driver);
		pPage.getProduct2().click();
		ProductDetailpage pdPage = new ProductDetailpage(driver);
		Select option = new Select(pdPage.getSize());
		Thread.sleep(1000);
		option.selectByVisibleText("M");
		Thread.sleep(1000);
		pdPage.getIncre().click();
		Thread.sleep(1000);
		pdPage.getCartBtn().click();
		Thread.sleep(3000);

		ShopContentPanel sPanel = new ShopContentPanel(driver);
		Thread.sleep(1000);
		sPanel.getContBtn().click();
		Thread.sleep(1000);
		pdPage.getBackHome().click();
		Thread.sleep(1000);
		pPage.getProduct6().click();
		Thread.sleep(2000);
		pdPage.getCartBtn().click();
		Thread.sleep(3000);
		sPanel.getProceedBtn().click();
		Thread.sleep(2000);

		ShoppingCartpage shopCart = new ShoppingCartpage(driver);
		shopCart.delProductTwo().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.invisibilityOf(shopCart.delProductTwo()));

		Assert.assertEquals(shopCart.getTotalAmt().getText(),"$64.44");
		Thread.sleep(1000);
	}
	@AfterTest
	public void tearDown(){
		driver.close();
		driver = null;
	}
}
