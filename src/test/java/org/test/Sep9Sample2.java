package org.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sep9Sample2 extends BaseClass {
WebElement element;

@Test
public void test1() {
element = locateByXPath("//button[@type='submit']//span[contains(text(),'Login')]");
click(element);
System.out.println("loggedin account");
	}
@Test
public void test2() {
element = driver.findElement(By.xpath("(//div[@class='eFQ30H'])[6]"));
Actions act=new Actions(driver);
act.moveToElement(element).build().perform();
System.out.println("mousehover Home");
	}
	
}
 