package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTestNG {
	static WebDriver driver;
	@Test(priority=-1)
	public void test1() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String actTitle = driver.getTitle();
String currentUrl = driver.getCurrentUrl();
boolean contains = currentUrl.contains("facebook");
System.out.println(contains);
System.out.println("running test1");
}
	@Test(priority=0)
	public void test2() {
WebElement txtEmail = driver.findElement(By.id("email"));
txtEmail.sendKeys("deepthi@123");
String attribute = txtEmail.getAttribute("value");
Assert.assertEquals("deepthi@123", attribute);//pass
WebElement txtPass = driver.findElement(By.id("pass"));
txtPass.sendKeys("pass123");
String attribute2 = txtPass.getAttribute("value");
Assert.assertNotEquals("pass456", attribute2);//pass
System.out.println("running test2");
	}
	@Test(enabled=false)
	private void test3() {
driver.navigate().to("https://www.amazon.in/");
	System.out.println("running test3");
	}
	@Test(priority=1)
	private void test4() {
driver.findElement(By.name("login")).click();
	}
	

}
