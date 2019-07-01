package dataProvider;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Base.BaseTerms;

public class ExcelUtilsReader extends BaseTerms{
private static XSSFWorkbook ExcelWBook; 
    
    private static XSSFSheet ExcelWSheet; 
    
    private static XSSFCell Cell; 

    
    
    public static void setExcelFile(String Path , String SheetName) throws Exception {
		    try {
		        
		        FileInputStream ExcelFile = new FileInputStream(Path); 
		        
		        ExcelWBook = new XSSFWorkbook(ExcelFile);
		        
		        ExcelWSheet = ExcelWBook.getSheet(SheetName);
		    
		        
		    } catch (Exception ex) {
		        throw (ex);
		        
		    }
    
    }
        
    public static String getCellData(int RowNum, int ColNum) throws Exception{
        
        try {
            Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
             String CellData = Cell.getStringCellValue();
             
               return CellData; 
        } catch (Exception ex) {
            
            return "";
        }
   }
}          