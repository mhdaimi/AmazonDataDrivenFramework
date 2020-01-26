package in.amazon.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Excel {
	
	
	public static ArrayList<String> getRowData(int rowNumber, String sheetName) throws Exception{
		
		File file = new File("D:\\Workspaces\\Batch-5\\DataDrivenFramework\\src\\in\\amazon\\testData\\AmazonData.xls");
		FileInputStream inputStream = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		HSSFSheet sheet = workbook.getSheet(sheetName);
		HSSFRow row = sheet.getRow(rowNumber);
		int maxCells = row.getLastCellNum();
		ArrayList<String> data = new ArrayList<>();
		for(int i=0; i<maxCells; i++) {
			HSSFCell cell = row.getCell(i);
			String temp = cell.getStringCellValue();
			data.add(temp);
		}
		return data;
	}
}
