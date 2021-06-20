package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {

	public static Object[][] data(String sheetname) throws IOException {

		// Logic to read the data from the data sheet using Apache POI

		XSSFWorkbook workbook = new XSSFWorkbook(
				"D:\\Eclipse Workspace\\selenium_testing\\src\\main\\resources\\Datasheet.xlsx");

		XSSFSheet sheet1 = workbook.getSheet(sheetname);

		int no_of_rows = sheet1.getLastRowNum();
		System.out.println("rows are" + no_of_rows);

		int no_of_col = sheet1.getRow(0).getLastCellNum();

		System.out.println("columns are :" + no_of_col + "");

		// Logic to convert received data from datasheet in 2 dimensional object array
		// for data provider
		Object[][] array3 = new Object[no_of_rows][no_of_col];

		for (int i = 0; i < no_of_rows; i++) {

			for (int j = 0; j < no_of_col; j++) {

				array3[i][j] = sheet1.getRow(i + 1).getCell(j).toString();

			}
		}

		System.out.println("my commit");
		return array3;
		
		

	}

}
