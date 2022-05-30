package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String string) {

		if (string.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Derin\\eclipse-workspace\\Adactin\\Driver1\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else {

			System.out.println("Invalid");

		}

		driver.manage().window().maximize();

		return driver;

	}

	public static String getUrl(String url) {

		driver.get(url);

		return url;

	}

	public static void sendKeys(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public static void dropDown(WebElement element, String string, String input) {

		Select s = new Select(element);

		if (string.equalsIgnoreCase("value")) {

			s.selectByValue(input);

		} else if (string.equalsIgnoreCase("text")) {

			s.selectByVisibleText(input);

		}

		else {

			s.selectByIndex(Integer.parseInt(input));

		}

	}

	public static void takeScreenshot(String picname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\Derin\\eclipse-workspace\\Adactin\\ScreenShot\\" + picname + ".png");

		FileUtils.copyFile(source, destination);

	}

	public static void clear(WebElement element) {
		element.clear();
	}

}
