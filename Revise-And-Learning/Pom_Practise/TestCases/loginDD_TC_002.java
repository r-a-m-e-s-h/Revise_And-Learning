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

import PageObjects.LoginPage;

public class loginDD_TC_002 extends BaseClass {



	@DataProvider(name="xlData")
	public Object[][] getXlData() throws IOException
	{
		// System.getProperty("user.dir")+
		String fpath ="Pom_Practise/utilites/TestData.xlsx";
		FileInputStream fis = new FileInputStream(fpath);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet2");
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
	
	@Test(dataProvider="xlData")
	public void DDtest(String uname, String pwd) throws InterruptedException
	{
		//System.out.println("The username is : "+uname);
		//System.out.println("The password is :"+pwd);
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterUserName(uname);
		lp.EnterPwd(pwd);
		lp.clickLoginBtn();
	}

}
