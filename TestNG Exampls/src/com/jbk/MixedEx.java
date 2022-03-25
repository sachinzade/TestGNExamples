package com.jbk;

import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;


@Listeners(MixedListener.class)
public class MixedEx {
	@Test(dataProvider = "dp")
	public void login(String uname, String password, String expt) throws Exception {
		FileInputStream fis = new FileInputStream("properties1.properties");
		Properties prt = new Properties();
		prt.load(fis);
		String s1 = prt.getProperty("url");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(s1);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys(uname);
		driver.findElement(By.xpath("//*[contains(@id,'password')]")).sendKeys(password);
		driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();

		String act = driver.getTitle();
		driver.close();
		Assert.assertEquals(act, expt);

	}

	@Test(dataProvider = "dp")
	public void Logout(String uname, String password, String expt) throws Exception {
		throw new SkipException("Skipping test case");

	}

	@DataProvider
	public Object[][] dp() throws Exception {
		FileInputStream fis = new FileInputStream("test1.xls");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sh = workbook.getSheet("Sheet1");
		int col = sh.getColumns();
		int row = sh.getRows();
		String[][] arrdata = new String[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Cell cel = sh.getCell(j, i);
				String data = cel.getContents();
				arrdata[i][j] = data;
			}
		}
		return arrdata;
	}
}
