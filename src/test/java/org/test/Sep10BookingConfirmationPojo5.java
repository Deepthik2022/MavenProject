package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sep10BookingConfirmationPojo5 extends BaseClass {
	public Sep10BookingConfirmationPojo5() {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(linkText="Logout")
	private WebElement logOut;

	public WebElement getLogOut() {
		return logOut;
	}

	

}
