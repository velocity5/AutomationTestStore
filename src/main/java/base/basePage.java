package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class basePage {

	private String url;
	private Properties prop;
	// using Constructor
	public basePage() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		prop.load(data);
	}
	public static WebDriver getDriver() throws IOException{
		return WebDriverConstant.getDriver();
	}
	public String getUrl() {
		url = prop.getProperty("url");
		return url;
	}
	public void takeSnapShot(String name) throws IOException {
		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "\\src\\target\\Screenshots\\" + timeStamp() + ".png");
		FileUtils.copyFile(srcFile,destFile);
	}
	public String timeStamp(){
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
}

