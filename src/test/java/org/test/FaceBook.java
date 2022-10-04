package org.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClass{
	public static void main(String[] args) {
		FaceBook fb=new FaceBook();
		fb.browserConfig();
		fb.launchUrl("https://www.facebook.com/");
		fb.maxWindow();
		WebElement email = fb.locateById("email");
		fb.txtInput(email, "deepthi@gmail.com");
		WebElement password = fb.locateById("pass");
		fb.txtInput(password, "abc@123");
		WebElement btnLogin = fb.locateByName("login");
		fb.click(btnLogin);
		
		
		
		
		
		
		
	}

	

}
