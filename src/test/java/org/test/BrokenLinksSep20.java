package org.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksSep20 { 
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int size = allLinks.size();
		for (WebElement links : allLinks) {
			String text = links.getAttribute("href");
			System.out.println(text);
			if (text!=null) {
				URL u=new URL(text);
				URLConnection openConnection = u.openConnection();
				HttpsURLConnection hp=(HttpsURLConnection)openConnection;
				int responseCode = hp.getResponseCode();
				if (responseCode>=400) {
					System.out.println(text);
				}
			}
		}
		
	}

}
