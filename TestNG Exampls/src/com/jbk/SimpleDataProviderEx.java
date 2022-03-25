package com.jbk;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class SimpleDataProviderEx {
	@Test(dataProvider = "dp")
	public void CheckLoginCrentials(String uname, String Password, String ExpectMsg) throws Exception {
		FileInputStream fis = new FileInputStream("properties1.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String val = properties.getProperty("url");
		// System.out.println(val);

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(val);
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String ActualMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1/small")).getText();
		driver.close();
		Assert.assertEquals(ActualMsg, ExpectMsg);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
				new Object[] {"kiran@gmail.com", "123456", "Courses Offered" },
				new Object[] {"@#$#%$%", "", "Special Charecter not allowed" },
				new Object[] {"", "", "blank not allowed" }, };
	}
}
