package com.test.url;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWebElement {

	public static void main(String[] args) {
	    System.setProperty("webdriver.firefox.bin", "/Applications/FirefoxDeveloperEdition.app/Contents/MacOS/firefox-bin");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://manucestink.com/");

		List<WebElement> el = driver.findElements(By.cssSelector("*"));
		
		for (WebElement webElement : el) {
			print(webElement.getTagName());
		}
	}
	
	public static void print(String data) {
		System.out.println(data);
	}

}
