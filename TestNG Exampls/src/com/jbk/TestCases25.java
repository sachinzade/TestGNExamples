package com.jbk;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases25 {
	@Test
	public void LoginCorrectCredi() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String ExpectRslt = "Dashboard Courses Offered";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void checkSoftwareDevOpt() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/p"))
				.getText();
		String ExpectRslt = "Software Development";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void checkDataScienceOpt() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/p"))
				.getText();
		String ExpectRslt = "Data Science";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}

	@Test
	public void checkWebDevOpt() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).click();
		String ActualRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/p"))
				.getText();
		String ExpectRslt = "Web Development";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void checkAddUserBttn() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		String ActualRslt = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).getText();
		String ExpectRslt = "Add User";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void addUser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.id("username")).sendKeys("Sachin Zade");
		driver.findElement(By.id("mobile")).sendKeys("9405779493");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[3]/div/input"))
				.sendKeys("szade50@gmail.com");
		driver.findElement(By.id("course")).sendKeys("OJT Selenium");
		driver.findElement(By.id("Male")).click();
		WebElement ee = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select s1 = new Select(ee);
		s1.selectByVisibleText("Maharashtra");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[7]/div/input"))
				.sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input"))
				.sendKeys("1234567890");
		driver.findElement(By.id("submit")).click();
		String Alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String ActualRslt = Alert;

		String ExpectRslt = "User Added Successfully. You can not see added user.";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void deleteDefualtUser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span"))
				.click();
		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String ActualRslt = alert;
		String ExpectRslt = "You can not delete Default User";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void deleteUserSagar() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"tr_2\"]/td[8]/a/span")).click();
		driver.switchTo().alert().accept();
		String ActualRslt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String ExpectRslt = "User deleted successfully.";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void deleteUserMonica() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[8]/a/span"))
				.click();
		String ActualRslt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String ExpectRslt = "You can not delete Default User";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void deleteUserKimaya() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span"))
				.click();
		driver.switchTo().alert().accept();
		String ActualRslt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String ExpectRslt = "User deleted successfully.";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void openOraclePage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		/*
		 * getWindowHandle()--> returns the window handle of currently focused
		 * window/tab
		 */
		String mainwindow = driver.getWindowHandle();

		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[8]/a/span")).click();
		/*
		 * getWindowHandle()--> returns all windows/tabs handles launched/opened
		 * by same driver instance including all parent and child window.
		 */
		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		while (it.hasNext()) {
			String nextwindow = it.next();

			if (!mainwindow.equals(nextwindow)) {
				driver.switchTo().window(nextwindow);

				String ActualRslt = driver.getTitle();
				String ExpectRslt = "Java Downloads | Oracle";
				driver.close();
				Assert.assertEquals(ActualRslt, ExpectRslt);
			}
		}
	}

	@Test
	public void openSelStandlomePage() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());

		String ActualRslt = "2";
		String ExpectRslt = "2";
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
	}
	/*
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 * 
	 * @Test public void LoginCorrectCredi() {
	 * 
	 * }
	 */

}
