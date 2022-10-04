package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sep17a {
	@Test(groups="smoke")
	public void TC1() {
System.out.println("tc1");
	}
	@Test(priority=-3)
	public void TC2() {
		System.out.println("tc2");

	}
	@Test()
	public void TC3() {
		System.out.println("tc3");
	}
	@Parameters({"email","password"})
	@Test
	public void TC4(String email,String pass) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement txtUser = driver.findElement(By.id("email"));
txtUser.sendKeys(email);
WebElement txtPass = driver.findElement(By.id("pass"));
txtPass.sendKeys(pass);
WebElement btnLogin = driver.findElement(By.name("login"));
btnLogin.click();
	}
	

}
