package week6.day2.inclasspractice.dp;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
String filename="CreateLead";
XSSFWorkbook excel = new XSSFWorkbook("./inputdata/excel/"+filename+".xlsx");
XSSFSheet sheet =excel.getSheetAt(0); 
getSheetAt(0);


}
