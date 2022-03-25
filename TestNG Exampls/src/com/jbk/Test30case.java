package com.jbk;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test30case {
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
	public void chechCourses() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		ArrayList<String> coursesExp = new ArrayList<>();
		coursesExp.add("Selenium");
		coursesExp.add("Java / J2EE");
		coursesExp.add("Python");
		coursesExp.add("Php");

		ArrayList<String> coursesAct = new ArrayList<>();
		coursesAct.add(
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).getText());
		coursesAct.add(
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).getText());
		coursesAct.add(
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).getText());
		coursesAct.add(
				driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).getText());
		driver.close();
		Assert.assertEquals(coursesAct, coursesAct);
	}

	@Test
	public void chechCoursesMoreInfo() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		ArrayList<String> infoExp = new ArrayList<>();
		infoExp.add("More info");
		infoExp.add("More info");
		infoExp.add("More info");
		infoExp.add("More info");

		ArrayList<String> infoAct = new ArrayList<>();
		infoAct.add(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).getText());
		infoAct.add(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).getText());
		infoAct.add(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).getText());
		infoAct.add(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).getText());
		driver.close();
		Assert.assertEquals(infoAct, infoExp);

	}

	@Test
	public void chechCoursesMoreInfobyPartialLink() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		List<WebElement> lw = driver.findElements(By.partialLinkText("info"));
		for (WebElement webElement : lw) {
			webElement.click();
		}
		Set<String> ss = driver.getWindowHandles();
		int ActRslt = ss.size();
		int expRaslt = 5;
		Assert.assertEquals(ActRslt, expRaslt);
	}

	@Test
	public void checkSelMoreInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/a")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();

	}

	@Test
	public void checkJavaMoreInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[2]/div/a")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);


	}

	@Test
	public void checkPythonMoreInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[3]/div/a")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();
	}

	@Test
	public void checkPhpMoreInfo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/div[1]/h3")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[4]/div/a")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();
	}

	@Test
	public void mainnavigationOpt() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

		ArrayList<String> optionExp = new ArrayList<>();
		optionExp.add("Dashboard");
		optionExp.add("Users");
		optionExp.add("Operators");
		optionExp.add("Useful Links");
		optionExp.add("Downloads");
		optionExp.add("Logout");

		ArrayList<String> optionAct = new ArrayList<>();
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a/span")).getText());
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a/span")).getText());
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[4]/a/span")).getText());
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[5]/a/span")).getText());
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[6]/a/span")).getText());
		optionAct.add(driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[7]/a/span")).getText());
		driver.close();
		Assert.assertEquals(optionAct, optionExp);
	}

	@Test
	public void checkDashboard() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[2]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String Exprslt = "Dashboard Courses Offered";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkUser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String Exprslt = "User List";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkOpertors() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[4]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String Exprslt = "Operator List";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkUsefullinks() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String Exprslt = "* Internet Required";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkDownloads() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String Exprslt = "Downloads List";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkLogot() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[7]/a")).click();
		String Actrslt = driver.findElement(By.xpath("/html/body/div/div[2]/p[2]")).getText();
		String Exprslt = "Logout successfully";
		driver.close();
		Assert.assertEquals(Actrslt, Exprslt);

	}

	@Test
	public void checkUserList() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();

		ArrayList<String> userExp = new ArrayList<>();
		userExp.add("Kiran");
		userExp.add("Sagar");
		userExp.add("Monica");
		userExp.add("Kimaya");

		ArrayList<String> userAct = new ArrayList<>();
		userAct.add(driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]"))
				.getText());
		userAct.add(driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]"))
				.getText());
		userAct.add(driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[2]"))
				.getText());
		userAct.add(driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[2]"))
				.getText());
		driver.close();
		Assert.assertEquals(userAct, userExp);
	}

	@Test
	public void checkAdduserButton() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		String ActRslt = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div/h3")).getText();
		String ExpRslt = "Fill Below Details";
		driver.close();
		Assert.assertEquals(ActRslt, ExpRslt);
	}

	@Test
	public void checkAdduserCancel() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click();
		String ActRslt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3"))
				.getText();
		String ExpRslt = "User List";
		driver.close();
		Assert.assertEquals(ActRslt, ExpRslt);
	}

	@Test
	public void checkAdduserSubmit() {
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
		// getting the list of options from Drop-Down list
		List<WebElement> l = s1.getOptions();
		int size = l.size();
		for (int i = 0; i < size; i++) {
			String options = l.get(i).getText();
			System.out.println(options);
		}
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
	public void checkSelStandlomJAr() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();
	}

	@Test
	public void checkSelSourceJar() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[4]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();
	}

	@Test
	public void checkChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[5]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		
	}

	@Test
	public void checkChromeDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[6]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void checkMozilaFirefox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[7]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);

	}

	@Test
	public void checkMozilaFirefoxDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("/html/body/div/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[8]/td[8]/a/span")).click();

		Set<String> windows = driver.getWindowHandles();
		// System.out.println(windows.size());

		int ActualRslt = windows.size();
		int ExpectRslt = 2;
		driver.close();
		Assert.assertEquals(ActualRslt, ExpectRslt);
		driver.close();
	}
}
