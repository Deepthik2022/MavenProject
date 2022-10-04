package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axes1 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-15/09/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		driver.manage().window().maximize();
		WebElement goFirst = driver.findElement(By.xpath("//p[@class='fliCode' and text()='G8 113']//following::span[@class='linkText ctaLink'][1]"));
		Thread.sleep(5000);

		goFirst.click();
		String text3 = goFirst.getText();
	System.out.println(text3);
	
	
	}

}
