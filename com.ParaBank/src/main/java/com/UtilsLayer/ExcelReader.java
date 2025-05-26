package com.UtilsLayer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
public static 	XSSFWorkbook workbook;
public static XSSFSheet sheet;

	public static void readExcel(String path)
	{
		File f=new File(path);
		try
		{
			FileInputStream fis=new FileInputStream(f);
			 workbook=new XSSFWorkbook(fis);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	public static String getdata(int sheetindex,int roeindex,int colindex)
	{
		XSSFSheet sheet=workbook.getSheetAt(sheetindex);
		String data=sheet.getRow(roeindex).getCell(colindex).getStringCellValue();
		return data;
		
		
	}
	
	public static int getrowcount(int sheetindex)
	{
		XSSFSheet sheet=workbook.getSheetAt(sheetindex);
		int rowcount=sheet.getLastRowNum();
		return rowcount;
		
		
	}
	
	public static int getcolumnount(int sheetindex)
	{
		XSSFSheet sheet=workbook.getSheetAt(sheetindex);
		int colcount=sheet.getRow(0).getLastCellNum();
		return colcount;
		
		
	}
	
		
		
	
	

}
