package com.company.billing.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.company.billing.model.Product;

public interface ExcelReader {
	public static ArrayList<Product> readXLS(File file) throws IOException {
		ArrayList<Product> productsList = new ArrayList<>();
		boolean isFirstPass = true;
		
		if(!file.exists()) {
			return null;
		}
		
		FileInputStream fis = new FileInputStream(file); // create a pipe b/w application and file for flow of data
		HSSFWorkbook workbook = new HSSFWorkbook(fis); // I know how to read data from .xlsx
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> rows = sheet.rowIterator();
		
		while(rows.hasNext()) {
			int cellCounter = 1;
			Row currentRow = rows.next();
			if(isFirstPass) {
				isFirstPass = false;
				continue;
			}
			Iterator<Cell> cells = currentRow.cellIterator();
			Product product = new Product();
			while(cells.hasNext()) {
				Cell currentCell = cells.next();
				switch(cellCounter) {
				case 3:
					product.setId(currentCell.getStringCellValue());
					break;
				case 1:
					product.setName(currentCell.getStringCellValue());
					break;
				case 2:
					product.setCategory(currentCell.getStringCellValue());
					break;
				case 6:
					product.setDescription(currentCell.getStringCellValue());
					break;
				case 4:
					product.setPrice(currentCell.getNumericCellValue());
					break;
				case 5:
					product.setPath(currentCell.getStringCellValue());
					break;
				case 7:
					product.setBrand(currentCell.getStringCellValue());
				}
				cellCounter++;
			} // cell loop ends
			productsList.add(product);
		}  // row loop ends
		workbook.close();
		fis.close();
		return productsList;
	}
}
