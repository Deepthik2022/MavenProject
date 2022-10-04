package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitSample1Aug27 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.flipcart.com/");
		driver.manage().window().maximize();
		System.out.println("launched application successfully");
	}
	@Before
	public void before() {
		Date date=new Date();
		System.out.println("start time: "+date);

	}
	@Test

	public void test1() throws Exception {
		File file=new File("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue1 = cell.getStringCellValue();
	 driver.findElement(By.id("email")).sendKeys(stringCellValue1);
	 Cell cell2 = row.getCell(1);
	 String stringCellValue2= cell2.getStringCellValue();
	 driver.findElement(By.id("pass")).sendKeys(stringCellValue2);
	 System.out.println("username and password eneterd successfully");
	}
	@Test
	public void test2() {
	driver.findElement(By.name("login")).click();
	System.out.println("clicked login button successfully");
	}
	@After
	public void after() {
		Date date2=new Date();
	System.out.println("end time: "+date2);
	}
	@AfterClass
	public static void afterClass() {
	driver.quit();
	}
}
