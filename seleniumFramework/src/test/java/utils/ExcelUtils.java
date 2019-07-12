package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public ExcelUtils(String excelPath, String sheetName) {
		XSSFWorkbook workbook;
		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			XSSFSheet sheet = workbook.getSheet(sheetName);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//getRowCount();
		//getCellDataNumber(1, 1);
		//getCellDataString(0, 0);
		//getColCount();
	}
	public static int getRowCount() {
		XSSFWorkbook workbook;
		int rowCount = 0;
		
		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows is "+rowCount);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		return rowCount;

	}

	public static String getCellDataString(int rowNum, int colNum) {
		XSSFWorkbook workbook;
		String cellData = null;
		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("Data in the sheet is "+cellData);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		return cellData;


	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		XSSFWorkbook workbook;
		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println("Data in the sheet is "+cellData);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
	}

	public static int getColCount() {
		XSSFWorkbook workbook;
		int colCount = 0;
		try {
			String projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"\\excel\\data.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");

			colCount = sheet.getRow(1).getPhysicalNumberOfCells();
			System.out.println("Number of columns is "+colCount);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		return colCount;
	}
}
