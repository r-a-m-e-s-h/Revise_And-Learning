package DataDriven_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test_Sep13File {



	@DataProvider(name="xldata")
	public Object[][] getData() throws IOException
	{
		String fpath = System.getProperty("user.dir")+"/TestData.xlsx";
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





	@Test(dataProvider = "xldata")
	public void testGetDataFromXLFile(String uname, String pwd)
	{
		System.out.println("The username is : "+uname);
		System.out.println("The pwd is : "+pwd);
	}

}
