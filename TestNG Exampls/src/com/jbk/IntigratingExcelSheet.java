package com.jbk;

import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class IntigratingExcelSheet {
	@Test(dataProvider = "dp")
	public void f(String uname, String password, String ExpRslt) throws Exception {
		FileInputStream fis = new FileInputStream("properties1.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String val = properties.getProperty("url");
		// System.out.println(val);

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(val);
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Assert.assertEquals(driver.getTitle(), ExpRslt);
		driver.close();
	}

	@DataProvider
	public Object[][] dp() throws Exception {
		FileInputStream fis = new FileInputStream("test1.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		int coloumns = sh.getColumns();
		System.out.println("rows : " + rows);
		System.out.println("coloumns : " + coloumns);
		String[][] arrdata = new String[rows][coloumns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumns; j++) {
				Cell cel = sh.getCell(j, i);
				String data = cel.getContents();
				System.out.println(data);
				// logic to pass values to 2d string array
				arrdata[i][j] = data;
			}
		}
		return arrdata;
	}
}
