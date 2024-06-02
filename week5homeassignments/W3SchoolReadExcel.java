package week5homeassignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class W3SchoolReadExcel {
	
	public static void main(String[] args) throws IOException {
			
		//Setup the path of the workbook

	XSSFWorkbook wb =new XSSFWorkbook("./data/W3School Testdata.xlsx");
	
	//Setup the worksheet
	
	XSSFSheet ws=wb.getSheet("sheet1");
	
	//Get the Row count excluding header
	
	int rowCount = ws.getLastRowNum();
	int cellCount=ws.getRow(0).getLastCellNum();
	System.out.println( "Total no of Rows: "+rowCount);
	System.out.println( "Total no of Rows: "+cellCount);		
	for (int i=1;i<=rowCount;i++) {
	for(int j=0;j<cellCount;j++) {
		 
		//Read the data from cell
		String[][] dp=new String[rowCount][cellCount];
		String Value = ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(Value);
		dp[i-1][j] =Value;
		
		}

		
	
	}	
	wb.close();
	
	
	
}
}



