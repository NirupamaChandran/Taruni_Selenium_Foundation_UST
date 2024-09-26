package com.automation.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.IOException;


public class DataProviderClass {

    @DataProvider(name = "data")
    public Object[][] exceldata() throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook("src/test/resources/data/searchData.xlsx");
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        Object[][] obj = new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
        Row row = sheet.getRow(sheet.getLastRowNum());
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            for (int j = 0; j < row.getLastCellNum(); j++) {
                XSSFCell cell = sheet.getRow(i).getCell(j);
                obj[i - 1][j] = cell.toString();
            }
        }
        return obj;
    }
}
