package org.fbtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCopy {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static String PageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;

	}

	public static void passtext(String txt, WebElement ele) {
		ele.sendKeys(txt);

	}

	public static void closeEntireBrowser() {
		driver.quit();

	}

	public static void clickBtn(WebElement ele) {
		ele.click();

	}

}
