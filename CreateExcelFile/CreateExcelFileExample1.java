package CreateExcelFile;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateExcelFileExample1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
try {
	
	//creating an instance of Workbook class   
			Workbook workbook = new HSSFWorkbook();
	// 
			//declare file name to be create   
			String filename = "F:\\Hasina\\AlmaMatter\\AlmaMatter\\Balance.xls"; 
			//invoking creatSheet() method and passing the name of the sheet to be created   
			HSSFSheet sheet = (HSSFSheet) workbook.createSheet("January");   
			//creating the 0th row using the createRow() method  
			HSSFRow rowhead = sheet.createRow((short)0);  
			//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
			rowhead.createCell(0).setCellValue("S.No.");  
			rowhead.createCell(1).setCellValue("Customer Name");  
			rowhead.createCell(2).setCellValue("Account Number");  
			rowhead.createCell(3).setCellValue("e-mail");  
			rowhead.createCell(4).setCellValue("Balance");  
			//creating the 1st row  
			HSSFRow row = sheet.createRow((short)1);  
			//inserting data in the first row  
			row.createCell(0).setCellValue("1");  
			row.createCell(1).setCellValue("Hasina Begum");  
			row.createCell(2).setCellValue("12345");  
			row.createCell(3).setCellValue("hasina.begum@gmail.com");  
			row.createCell(4).setCellValue("700000.00");  
			//creating the 2nd row  
			HSSFRow row1 = sheet.createRow((short)2);  
			//inserting data in the second row  
			row1.createCell(0).setCellValue("2");  
			row1.createCell(1).setCellValue("Nabi Khan");  
			row1.createCell(2).setCellValue("12346");  
			row1.createCell(3).setCellValue("nabi.khan@gmail.com");  
			row1.createCell(4).setCellValue("200000.00");  
			FileOutputStream fileOut = new FileOutputStream(filename);  
			workbook.write(fileOut);  
			//closing the Stream  
			fileOut.close();  
			//closing the workbook  
			workbook.close();  
			//prints the message on the console  
			System.out.println("Excel file has been generated successfully.");
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} 
	}
}