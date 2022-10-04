package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sep19c {
	WebDriver driver;
@Parameters({"browser","fname","email","mobNum","country","city"})
@Test(groups="smoke")
public void TC1(String brwsr,String firstName,String email,String mob,String location,String city) {
	if (brwsr.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if (brwsr.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			}
driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[@class='modal__close']")).click();
driver.findElement(By.id("first-name")).sendKeys(firstName);
driver.findElement(By.id("email")).sendKeys(email);
driver.findElement(By.id("mobile")).sendKeys(mob);
WebElement country = driver.findElement(By.name("country"));
Select select=new Select(country);
select.selectByVisibleText(location);
driver.findElement(By.id("city")).sendKeys(city);
}
@Test(dataProvider="SampleData")
public void TC2(String text) {
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.findElement(By.name("message")).sendKeys(text);
	driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']")).click();
	}
@DataProvider(name="SampleData")
public Object[][] data() {
	return new Object[][] {
		{"hdiudiUGDIugdil"},	
		};
	}			
@Parameters({"lname"})
@Test(groups="regression")
public void TC3(String lastName) {
	driver.findElement(By.id("last-name")).sendKeys(lastName);
}


}
