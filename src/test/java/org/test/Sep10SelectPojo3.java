package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sep10SelectPojo3 extends BaseClass {
	public Sep10SelectPojo3()
	{
		PageFactory.initElements(driver, this);
}
	@FindBy(id="radiobutton_2")
	private WebElement selectRadio;
	@FindBy(id="continue")
	private WebElement continueBtn;
	public WebElement getSelectRadio() {
		return selectRadio;
	}
	public WebElement getContinueBtn() {
		System.out.println("selected Hotel");
		return continueBtn;
	}

}
