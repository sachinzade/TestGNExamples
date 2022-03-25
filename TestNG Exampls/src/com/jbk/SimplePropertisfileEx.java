package com.jbk;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimplePropertisfileEx {
	@Test
	public void LogInPage() throws Exception {
		FileInputStream fis = new FileInputStream("properties1.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String val = properties.getProperty("url");
		System.out.println(val);

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(val);
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String ExpectMsg = "Dashboard Courses Offered";
		driver.close();
		Assert.assertEquals(ActualMsg, ExpectMsg);
	}

}
