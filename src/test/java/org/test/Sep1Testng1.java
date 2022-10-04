package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sep1Testng1 {
	static WebDriver driver;
	@BeforeClass
	public void beforeClass() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
System.out.println("launched application");
	}
	@Test(priority=0)
	private void test1() throws Exception {
		File file=new File("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
driver.findElement(By.id("email")).sendKeys(stringCellValue);
System.out.println("TC1 running");
}
	@Test(priority=-1)
	private void test2() throws Exception {
		File file=new File("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook book=new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet2");
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		String stringCellValue2 = cell2.getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(stringCellValue2);
		System.out.println("TC2 running");

	}
	@Test(enabled=false)
	private void test3() {
driver.findElement(By.name("login")).click();
System.out.println("TC3 running");
	}
	@AfterClass
	private void afterClass() {
driver.quit();
System.out.println("quit the browser");
	}

}
