package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class SimpleExcelPro {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("test1.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int rows = sh.getRows();
		int coloumns = sh.getColumns();
		System.out.println("rows : " + rows);
		System.out.println("coloumns : " + coloumns);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < coloumns; j++) {
				Cell cel = sh.getCell(j, i);
				String data = cel.getContents();
				System.out.println(data);
			}
		}
	}

}
