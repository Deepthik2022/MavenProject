
package org.test;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class BaseClass {
	private static final String pathname = null;
	private static final File srcFile = null;
	private static final File destFile = null;
	static WebDriver driver;
	static Select select;
 //static Actions act;
	static Alert alert;
	static Robot rob;
	static TakesScreenshot tk;
	static JavascriptExecutor jk;//
	static WebElement findElement;
	

	
	public static void browserConfig() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public String Title() {
		String title = driver.getTitle();
		return title;
	}
	public int titleLength() {
int length = driver.getTitle().length();
return length;
	}
	public String currentUrl() {
String url = driver.getCurrentUrl();
return url;
	}
	public String pageSource() {
String ps = driver.getPageSource();
return ps;
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public WebElement locateById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public static void txtInput(WebElement element,String value) {
		element.sendKeys(value);
	}
	public WebElement locateByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	public static void click(WebElement element) {
		element.click();
	}
	public void clear(WebElement element) {
		element.clear();
	}
	public void submit(WebElement element) {
		element.submit();
	}
	public WebElement locateByClass(String className) {
		WebElement element = driver.findElement(By.className(className));
		return element;
	}
	public Collection<WebElement> tagName(String tagName) {
List<WebElement> findElements = driver.findElements(By.tagName(tagName));
return findElements;
	}
	public WebElement locateByXPath(String xpath) {
WebElement element = driver.findElement(By.xpath(xpath));
return element;
	}
	public String getText(WebElement element,String value) {
		String text = element.getText();
		return text;
	}
	public static String getAtt(WebElement findElement) {
		String attribute = findElement.getAttribute("value");
		return attribute;
	}
	public WebElement locateByLinkText(String linkText) {
WebElement findElement = driver.findElement(By.linkText(linkText));
return findElement;
	}
	public WebElement locateByPartialLinkTest(String partialLinkTest) {
WebElement findElement = driver.findElement(By.partialLinkText(partialLinkTest));
return findElement;
	}
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public void forward() {
driver.navigate().forward();
	}
	public void back() {
driver.navigate().back();
	}
	public void refresh() {
driver.navigate().refresh();
	}
	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public Collection<String> getWindowHandles() {
Set<String> windowHandles = driver.getWindowHandles();
return windowHandles;
	}
	public void switchTo(String windowhandle) {
		driver.switchTo().window(windowhandle);
	}
	public static void selectByIndex(int index) {
//Select select=new Select();
select.selectByIndex(index);
	}
	public static void selectByValue(String value) {
		//select=new Select(findElement);
		select.selectByValue(value);
	}
	public void selectByVisibleText(String value) {
		Select select=new Select(findElement);
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDown(By locator,String type,String value) {
Select select=new Select(getElement(locator));
switch (type) {
case "index":
	select.selectByIndex(Integer.parseInt(value));
	break;
case "value":
	select.selectByValue(value);
	break;
case "visibleText":
	select.selectByVisibleText(value);
	break;

default:
	System.out.println("pass correct value");
	break;
}

	}
	
	
	public static WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		return null;
	}
	public void deSelectIndex(int index) {
		select=new Select(findElement);
		select.deselectByIndex(index);
	}
	public void deSelectValue(String Value) {
		select=new Select(findElement);
		select.deselectByValue(Value);
	}
	public void deSelectVisibleText(String Value) {
		select=new Select(findElement);
		select.deselectByVisibleText(Value);
	}
	public void deSelectAll() {
		select=new Select(findElement);
		select.deselectAll();
	}
	public Collection<WebElement> getOptions(){
		select=new Select(findElement);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public WebElement getFirstSelectedOpt() {
		select=new Select(findElement);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	public Collection<WebElement> getAllSelectedOpts() {
		select=new Select(findElement);
		Collection<WebElement> allSelectedOption = select.getAllSelectedOptions();
		return allSelectedOption;
	}
	public void moveToElement(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
		//act.moveToElement(element).perform();
	}
	public void dragDrop(WebElement element) {
		Actions act=new Actions(driver);
		act.dragAndDrop(element, element).perform();
	}
	public void doubleClick(WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}	
	public void rightClick(WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public int keyPress(int keyEvent) {
		rob.keyPress(keyEvent);
		return keyEvent;
	}
	public int keyRelease(int keyEvent) {
		rob.keyRelease(keyEvent);
		return keyEvent;
	}
	public void simple() {
alert=driver.switchTo().alert();
alert.accept();
	}
	public void confirm() {
alert.dismiss();
	}
	public void prompt(String key) {
alert.sendKeys(key);
	}
	
	public void getScreenShot() throws Exception {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src=tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		File desc=new File("C:\\Users\\Achyutha\\Downloads\\Test");
		FileUtils.copyFile(src, desc);
	}
		

	 public void locateFrameByIndex(String s,int index) {
		 List<WebElement> findElement2 = driver.findElements(By.tagName(s));
		 findElement2.size();
driver.switchTo().frame(index);
	}
	public void locateFrameByString(String s) {
		driver.switchTo().frame(s);
	}
	public void locateByWebElement(WebElement element) {
driver.switchTo().frame(element);
	}
	public void parentFrame() {
driver.switchTo().parentFrame();
	}
	String s1="arguments[0].scrollIntoView()";
	public void executeScript(String s1,WebElement element) {
		jk=(JavascriptExecutor)driver;
		jk.executeScript(s1, element);
	}
	String s="arguments[].setAttribute('value','value to insert')";
	public void setAttribute(String s,WebElement element) {
jk.executeScript(s, element);
	}
	String s2="arguments[0].click()";
	public void clickByJavaScript(String s2,WebElement element) {
		jk.executeScript(s, element);
	}
	public static void close() { 
driver.close();
	}
	public void quit() {
driver.quit();
	}
	
	public String excelRead(String path,String sheet,int row,int cell) throws Exception {
		String value="";
		String valueOf="";
		String format="";
File f=new File(path);
FileInputStream stream=new FileInputStream(f);
Workbook w=new XSSFWorkbook(stream);
Sheet s = w.getSheet(sheet);
Row r = s.getRow(row);
Cell c = r.getCell(cell);
//System.out.println(c);
int cellType = c.getCellType();
if (cellType==1) {
	value = c.getStringCellValue();
	System.out.println(value);
} else if (cellType==0) {
	if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
		format = sim.format(dateCellValue);
		System.out.println(format);
		
	} else {
		double numericCellValue = c.getNumericCellValue();
		long l=(long) numericCellValue;
		valueOf = String.valueOf(l);
		System.out.println(valueOf);

	}
}
return value;
//return null;
}
public void excelWrite(String path,String sheet,int row,int cell,String value) throws Exception {
File f=new File(path);
FileInputStream stream=new FileInputStream(f);
Workbook w=new XSSFWorkbook(stream);
Sheet s = w.getSheet(sheet);
Row r = s.getRow(row);
Cell c = r.getCell(cell);
c.setCellValue(value);
FileOutputStream fOut=new FileOutputStream(f);
w.write(fOut);
}
public void asstTrue(String url,String value) {
	url = driver.getCurrentUrl();
	boolean contains = url.contains(value);
Assert.assertTrue(contains);
System.out.println("assertTrue is Pass");

}
public void asstEquals(String att,String value) {
	Assert.assertEquals(value, att);
	System.out.println("assertEquals is Pass");


}
















}
	

	

	

	
	
	
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


