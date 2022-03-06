package com.test.url;

import java.io.File;
import java.util.List;
import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetWebElement {

	private static final Logger logger = LogManager.getLogger(GetWebElement.class);

	protected static final String osName = "os.name";

	public static void main(String[] args) throws InterruptedException {

		logger.info("Start");

		File nameFile;

		if (SystemUtils.IS_OS_WINDOWS) {
			nameFile = new File("apps/geckodriver.exe");
		} else {
			nameFile = new File("apps/geckodriver 2");
		}

		String pathToDriver = nameFile.getAbsolutePath();
		String webdriver = "webdriver.gecko.driver";

	    System.setProperty(webdriver, pathToDriver);
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://danylobigma.com/");

		List<WebElement> el = driver.findElements(By.cssSelector("*"));
		
		for (WebElement webElement : el) {
			print(webElement.getTagName());
		}

		Thread.sleep(5000);
		driver.quit();
		logger.info("end.");
	}

	public static void print(String data) {
		logger.info(data);
	}

	public String getOperatingSystem() {
		return System.getProperty(osName);
	}

	public static String getOperatingSystemSystemUtils() {
		return SystemUtils.OS_NAME;
	}

}
