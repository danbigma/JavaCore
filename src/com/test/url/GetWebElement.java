package com.test.url;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class GetWebElement {

	private static final Logger logger = LogManager.getLogger(GetWebElement.class);

	public static void main(String[] args) throws InterruptedException {

		logger.info("Start");

		String pathToDriver = "C:/dev/git_local/JavaCore/apps/geckodriver.exe";// "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin";
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

}
