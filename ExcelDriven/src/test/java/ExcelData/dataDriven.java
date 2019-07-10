package ExcelData;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public static void main(String[] args) throws IOException {
	
	}
	
	
	public ArrayList<String> getData(String testCaseName) throws IOException{
		
		// 1.identify sheet -"testdata"
		// 2.identify Testcases column by scanning the entire first row
		// 3.once column is identified then scan entire testcase row to identify purchase testcase row
		// 4.after you grab purchase testcase row = pull all the data of that row and feed in test
		
		//fileInputStream argument
		ArrayList <String> list = new ArrayList<String> ();//to add cell value
		
		FileInputStream file = new FileInputStream("C:\\Users\\Hurmik\\Documents\\dataDriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook (file);//this workbook have access to read file
		
		int i = workbook.getNumberOfSheets();//go and read worksheet
		for (int j=0; j<i; j++) {//find our sheet "testdata"
			if(workbook.getSheetName(j).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet =workbook.getSheetAt(j);//1.identify sheet -"testdata"	
				
				Iterator <Row> rows = sheet.iterator();
				Row firstRow = rows.next();
				
				Iterator <Cell> firstRowCol = firstRow.cellIterator();
				int k=0;
				int column=0;
				
				while(firstRowCol.hasNext()) {
					Cell value = firstRowCol.next();
				    if (value.getStringCellValue().equalsIgnoreCase("TestCases")) { //2.identify Testcases column
				    	
				    	column=k;
				    }
				    k++;
				}
				
				while(rows.hasNext()) {
					Row row = rows.next();
					if (row.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {//3.  identify purchase testcase row
						
						Iterator<Cell> purchaseRowCells = row.cellIterator();
						while (purchaseRowCells.hasNext()) {
							
							Cell cell = purchaseRowCells.next();
							if (cell.getCellTypeEnum()==CellType.STRING) {
								list.add(cell.getStringCellValue());
							}else {
								list.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
							}
							
						}
						
					}
				}
			}
		}
		
		return list;
	}

}
