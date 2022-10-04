package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sep20Parallel {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void TC1(String brwsr) {
if (brwsr.equals("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}else if (brwsr.equals("edge")) {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
	}

}
