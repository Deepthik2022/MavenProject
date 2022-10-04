package org.test;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		File file=new File("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook w=new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("sheet2");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy hh:mm:a");
		System.out.println(d);
		Cell cell3 = row.getCell(2);
		System.out.println(cell3.getCellType());
		
		System.out.println("username is "+username);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(username);
		Cell cell2 = row.getCell(1);
		String password = cell2.getStringCellValue();
		WebElement passkey = driver.findElement(By.id("pass"));
		passkey.sendKeys(password);
		System.out.println("password is "+password);
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btn.click();
		
		String s1="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100";
		String s2="https://www.facebook.com/";
		
		if (s1==s2) {
			System.out.println("login is successful");
		} else {
			System.out.println("login is unsuccessful");
		}
		}
}
