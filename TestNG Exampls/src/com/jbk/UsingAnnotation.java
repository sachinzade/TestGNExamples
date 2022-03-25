package com.jbk;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UsingAnnotation {
	WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");

	}

	@BeforeMethod
	public void tfff() {
		/*
		 * driver.findElement(By.id("//*[@id=\"email\"]")).clear();
		 * driver.findElement(By.id("//*[@id=\"password\"]")).clear();
		 */
		System.out.println("Executing test successfully...");

	}

	@Test
	public void userList() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String ExpectRslt = "User List";
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@AfterMethod
	public void afterMethod() {
		driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li/a")).click();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test
	public void useronline() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/aside/section/div/div[2]/a")).getText();
		String ExpectRslt = "Online";
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void checkDashboard() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String ExpectRslt = "Dashboard Courses Offered";
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void zz11() {
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div")).getText();
		String ExpectRslt = "Selenium\nAutomation Testing\nMore info";
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

}
