package org.test;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Sep9Sample1 extends BaseClass{
	WebElement element;

@Test
public void Test1() {
browserConfig();
launchUrl("https://www.flipkart.com/");
maxWindow();
System.out.println("launched application");
	}
@Test
public void test2() throws Exception {
element = locateByXPath("//input[@class='_2IX_2- VJZDxU']");
txtInput(element,"8247462374");
Thread.sleep(5000);
element = locateByXPath("//input[@type='password']");
String excelRead2 = excelRead("C:\\Users\\Achyutha\\eclipse-workspace\\MavenProject\\Excel\\excel.xlsx", "sheet2", 1, 1);
txtInput(element, excelRead2);
System.out.println("fetched login values");
}

}
