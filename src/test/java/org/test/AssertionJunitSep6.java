package org.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionJunitSep6 {
@Test
private void test1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String currentUrl = driver.getCurrentUrl();
	boolean contains = currentUrl.contains("facebook");
	System.out.println(contains);
	Assert.assertTrue(contains);
	WebElement txtEmail = driver.findElement(By.id("email"));
	txtEmail.sendKeys("welcome");
	String attribute = txtEmail.getAttribute("value");
	Assert.assertEquals("welcome", attribute);
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("test@123");
	
}

}
