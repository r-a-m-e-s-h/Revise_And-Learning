package testCases_example;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_DDT_example {
	
	
	
	@DataProvider(name="XLData")
	public Object[][] getXLData() throws IOException
	{
		String fpath ="practise-2-Nov-2023//utilites//TestData.xlsx";
		FileInputStream fis = new FileInputStream(fpath);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0;j<colCount;j++)
			{
				Cell cell = row.getCell(j);
				
				data[i-1][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	
	
	@Test(dataProvider="XLData")
	public void test_ddt(String uname, String pwd)
	{
		System.out.println(uname);
		System.out.println(pwd);
	}

}
