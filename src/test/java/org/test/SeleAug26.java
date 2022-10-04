package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleAug26 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		try {
			File file=new File("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx");
			FileInputStream stream=new FileInputStream(file);
			FileOutputStream out=new FileOutputStream(file);
			Workbook w=new XSSFWorkbook(stream);
			w.write(out);
			Sheet sheet = w.getSheet("sheet1");
			Sheet createSheet = w.createSheet();
			Row row = createSheet.getRow(0);
			System.out.println(row);
		} catch (Exception e) {
			
          System.out.println("file created");		
          }
	
	}
}
