package org.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Sep9Sample3 extends BaseClass {
WebElement element;

@Test
public void test1() {
element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[1]"));
		//element = locateByXPath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[1]");
Actions act=new Actions(driver);
act.moveToElement(element).build().perform();
System.out.println("mousehover HomeFurnishings");
	}
@Test
public void test2() throws Exception {
Thread.sleep(5000);
element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]"));
	//element = locateByXPath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/a[2]");
click(element);
System.out.println("clicked on linens");
close();
	}

}
