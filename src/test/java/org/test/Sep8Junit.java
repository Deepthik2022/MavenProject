package org.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sep8Junit extends BaseClass{
	WebElement element;
@BeforeClass
public static void beforeTest() throws Exception {
	browserConfig();
	launchUrl("https://www.facebook.com");
	maxWindow();
  Thread.sleep(5000);
}
@Test
public void test1() {
	String currentUrl = currentUrl();
	asstTrue(currentUrl, "facebook");
}
@Test
public void test2() throws Exception  {
	element = locateById("email");
	txtInput(element, "deepthi@gmail.com");
	String att = getAtt(element);
	System.out.println(att);
	asstEquals(att, "deepthi@gmail.com");
	} 
@Test
public void test3() throws Throwable {
	String excelRead = excelRead("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx", "sheet2", 1, 1);
	System.out.println("excel input as password: "+excelRead);
	element = locateById("pass");
	txtInput(element, excelRead);
	  Thread.sleep(5000);
}
@AfterClass
public static void afterTest() {
	close();
}
}

