package org.test;

import org.apache.xmlbeans.impl.xb.xsdschema.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sep10SearchPojo2 extends BaseClass {
	public Sep10SearchPojo2() 
	{
		PageFactory.initElements(driver, this);
}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		Select select=new Select(location);
		select.selectByVisibleText("Paris");
		System.out.println("selected location by VisibleText");
		return location;
		
	}
	public WebElement getSearch() {
		return search;
	}
	
	
	
}
