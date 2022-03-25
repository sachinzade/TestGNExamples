package com.jbk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoNaukri {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//div[contains(@class,'mTxt')]")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Jobs in Mumbai')]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'fleft lH20')]")).click();
		List<WebElement> WebElement = driver
				.findElements(By.xpath("//i[contains(@class,'fleft naukicon naukicon-checkbox')]"));
		for (WebElement webElement2 : WebElement) {
			webElement2.click();
		}
	}

}
