package com.jbk;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNaukriWeb {
	@Test
	public void f() throws Exception {
		FileInputStream fis = new FileInputStream("naukri.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String url = properties.getProperty("url");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[contains(@id,'expereinceDD')]")).sendKeys("1 year");

		// Assert.assertEquals(actual, expected);
	}
}
