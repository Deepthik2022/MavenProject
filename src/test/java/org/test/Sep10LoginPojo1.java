package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sep10LoginPojo1 extends BaseClass{
	
	public Sep10LoginPojo1() 
	{
		PageFactory.initElements(driver, this);	
}
	
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement passWord;
	@FindBy(id="login")
	private WebElement logIn;
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLogIn() {
		System.out.println("logged in successfully");
		return logIn;
	}
	
	

}
