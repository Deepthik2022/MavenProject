package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sep10BookingDetailsPojo4 extends BaseClass{
	public Sep10BookingDetailsPojo4() {
PageFactory.initElements(driver, this);	}
	@FindBy(id="first_name")
	private WebElement firstName;
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement billingAdd;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expDateMonth;
	@FindBy(id="cc_exp_year")
	private WebElement expDateYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillingAdd() {
		return billingAdd;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		Select select=new Select(ccType);
		select.selectByVisibleText("VISA");
		return ccType;
	}
	public WebElement getExpDateMonth() {
		Select select=new Select(expDateMonth);
		select.selectByVisibleText("December");
		return expDateMonth;
	}
	public WebElement getExpDateYear() {
		Select select=new Select(expDateYear);
		select.selectByVisibleText("2022");
		return expDateYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookNow() {
		System.out.println("Filled details");
		return bookNow;
	}
	
	
	
}
