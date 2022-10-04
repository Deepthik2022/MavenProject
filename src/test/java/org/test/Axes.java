package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Axes {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+13+pro+max&crid=10AUH0D68CQMX&sprefix=iphone+13+pro+max+%2Caps%2C223&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		//WebElement prod = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]"));
		WebElement prod2 = driver.findElement(By.xpath("((//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1])//following::span[@aria-label='Get it by tomorrow, September 15'][1]"));
		//prod.click();
		String text = prod2.getText();
		System.out.println(text);
		WebElement price = driver.findElement(By.xpath("((//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1])//following::span[@class='a-price-whole'][1]"));
		Thread.sleep(5000);

		String text2 = price.getText();
		System.out.println(text2);
		System.out.println("-----------------------------");
		driver.navigate().to("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-15/09/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		Thread.sleep(5000);

	//driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();

		WebElement goFirst = driver.findElement(By.xpath("//p[@class='fliCode' and text()='G8 113']//following::span[@class='linkText ctaLink'][1]"));
		Thread.sleep(5000);

		goFirst.click();
		String text3 = goFirst.getText();
	System.out.println(text3);
	
	/*WebElement viewFlights = driver.findElement(By.xpath("//p[@class='fliCode' and text()='G8 113']//following::span[@class='linkText ctaLink'][1]//following::div[@class='makeFlex flightDtlInfo']"));
	String text3 = viewFlights.getText();
	System.out.println(text3);
	Thread.sleep(5000);
/*WebElement fli = driver.findElement(By.xpath("//p[@class='fliCode' and text()='G8 113']//following::span[@class='linkText ctaLink'][1]//following::div[8]"));
	System.out.println(fli.getText());*/
	}
	
	

}
