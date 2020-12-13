import java.io.FileInputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellPractice {
	private static Workbook book;
	private static Sheet sheet;
	
	public static void readExcell(String filePath, String sheetName) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			book=new XSSFWorkbook(fis);
			sheet=book.getSheet(sheetName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int getRows() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public static int getCols() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public static String getCell(int row, int col) {
		String cell=sheet.getRow(row).getCell(col).toString();
		return cell;
	}
	
	public static Object[][] excellIntoArray(String filePath, String sheetName){
		readExcell(filePath, sheetName);
		
		Object[][] data=new Object[getRows()-1][getCols()];
		for(int i=1;i<getRows();i++) {
			for(int j=0;j<getCols();j++) {
				data[i-1][j]=getCell(i, j);
			}
		}
		return data;
	}
	
	public static List<Map<String, String>> excelToListOfMaps(String filePath, String sheetName){
		List<Map<String, String>> lmap=new LinkedList<Map<String, String>>();
		
		for (Map<String, String> map : lmap) {
			Set<Entry<String, String>> mset=map.entrySet();
			mset.
			
		}
		
	}
}
