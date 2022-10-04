package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTestSep19a {
	@Test(dataProvider ="Authentication")
	public void test(String email,String pass) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://mail.google.com/");
driver.manage().window().maximize();
WebElement txtUser = driver.findElement(By.id("identifierId"));
txtUser.sendKeys(email);
WebElement btnNext = driver.findElement(By.xpath("//span[@jsname='V67aGc' and text()='Next']"));
btnNext.click();
WebDriverWait wait=new WebDriverWait(driver, 40);
WebElement until2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));
until2.sendKeys(pass);
/*driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
WebElement txtPass = driver.findElement(By.name("Passwd"));
txtPass.sendKeys(pass);*/
Thread.sleep(5000);
WebElement btnLogin = driver.findElement(By.xpath("//span[@jsname='V67aGc' and text()='Next']"));
btnLogin.click();

	}
	@DataProvider(name="Authentication")
	public Object[][] credentials(){
		return new Object[][] {
			
			{"kdeepthi395@gmail.com","test@1234567"},
			{"user1@gmail.com","test123"}
			
			
			};
		}

}
