package augmaven2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXl
{

	

	 public static void main (String [] args) throws IOException{
	
	FileInputStream fis = new FileInputStream("C:\\Users\\daya.sena\\eclipse-workspace\\augmaven2\\src\\csv.xlsx");
	 XSSFWorkbook workbook = new XSSFWorkbook(fis);
	 XSSFSheet sheet = workbook.getSheetAt(0);
	                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
	                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	 Row row = sheet.getRow(0);
	 Cell cell = row.getCell(0);
	
	//System.out.println(cell);
	
	//System.out.println(sheet.getRow(0).getCell(0));
	 
	 
	 }
	
	
	/*
	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		//Create an object of File class to open xlsx file
		File file =    new File(filePath+"\\"+fileName);
		
		Workbook myWorkbook = null;
		
		//Create an object of FileInputStream class to read excel file
	    FileInputStream inputStream = new FileInputStream(file);
	    
	   
	  //If it is xlsx file then create object of XSSFWorkbook class
	    myWorkbook = new XSSFWorkbook(inputStream);
	    
	    
	  //Read sheet inside the workbook by its name
	    Sheet guru99Sheet = myWorkbook.getSheet(sheetName);

	    
	    	    
	  //Find number of rows in excel file
	    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
	   
	  
	    
	  //LOOOP - Create a loop over all the rows of excel file to read it  
	  for (int i = 0; i < rowCount+1; i++) {
	    
				   Row row = guru99Sheet.getRow(i);
	    	
	    	
	        
	        //Create a loop to print cell values in a row
	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console
	            System.out.print(row.getCell(j).getStringCellValue());

	        }

	        System.out.println();
	    } 
	    
	    
	}
	
	
	
	
	
	
	
	public static void main(String[] args) throws IOException 	{
		
		//Create an object of ReadGuru99ExcelFile class
		ReadXl objExcelFile = new ReadXl();
		
		String filePath = "C:\\Users\\daya.sena\\eclipse-workspace\\augmaven2\\src\\";
		
		//Call read file method of the class to read data
		objExcelFile.readExcel(filePath,"csv.xlsx","CSVManifest (1)");
	}
	
	
	
	*/
	
	
	
	/*
	
	public static void main(String[] args) 	{
		
try(XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\daya.sena\\eclipse-workspace\\augmaven2\\src\\cvs.xlsx"))){
	
	XSSFSheet sheet = workbook.getSheet("CSVManifest (1)");
	int first = sheet.getFirstRowNum();
	int last = sheet.getLastRowNum();


 
//FileInputStream fis = new FileInputStream("C:\\Users\\daya.sena\\eclipse-workspace\\augmaven2\\src\\cvs.xlsx");



//XSSFWorkbook workbook = new XSSFWorkbook(fis);



					for(int i=first; i < last; i++) {
				   Row row = sheet.getRow(i);
				   
				  
				   for(int j=row.getFirstCellNum(); j <row.getLastCellNum(); j++) {
					   Cell cell = row.getCell(j);
					   System.out.println(cell.getStringCellValue());
				   }
				   
				
					}
			
			

}

 
	
	
	}*/
	
	
}
