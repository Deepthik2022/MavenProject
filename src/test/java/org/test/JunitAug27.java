package org.test;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitAug27 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
		
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	System.out.println("launched application successfully");
	}
	@Before
	public void before() {
		Date date1=new Date();
		System.out.println("start time is: "+date1);
	}
	@Test
	public void test1() throws InterruptedException {
driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
System.out.println("clicked on login button");
Thread.sleep(5000);
driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("+918247462374");
driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Achyutha@12");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	}
	
	

}
