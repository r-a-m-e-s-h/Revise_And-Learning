package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Loginpage_Practise;

public class LoginDDT_Practise extends BaseClass_Practise {
	
	
	
	@DataProvider(name="xldata")
	public Object[][] getXlData() throws IOException
	{
		String floc = "practise-24-oct-2023/Utilites_Practise/TestData.xlsx";
		FileInputStream fis = new FileInputStream(floc);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
				
		Object[][] data= new Object[rowCount][colCount];
		
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
	
	@Test(dataProvider = "xldata")
	public void test_ddt(String name, String pwd) throws InterruptedException
	{
		
		Loginpage_Practise lp1 = new Loginpage_Practise(driver);
		
		lp1.enterUserName(UserName);
		lp1.enterPassWord(passWord);
		lp1.clickLoginBtn();
		lp1.clickLogoutBtn();
		
		System.out.println(name +" "+pwd);
		
	}

}
