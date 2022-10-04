package org.test;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;

public class Sep10Adactin extends BaseClass {
	public static void main(String[] args) {
		browserConfig();
		launchUrl("http://adactinhotelapp.com/");
		maxWindow();
		Sep10LoginPojo1 lgin = new Sep10LoginPojo1();
		txtInput(lgin.getUserName(), "Deepthik");
		txtInput(lgin.getPassWord(), "Achyutha@12");
		click(lgin.getLogIn());
		Sep10SearchPojo2 srch = new Sep10SearchPojo2();
		srch.getLocation();
		click(srch.getSearch());
		Sep10SelectPojo3 selHotel = new Sep10SelectPojo3();
		click(selHotel.getSelectRadio());
		click(selHotel.getContinueBtn());
		Sep10BookingDetailsPojo4 bookiDetails = new Sep10BookingDetailsPojo4();
		txtInput(bookiDetails.getFirstName(), "Deepthi");
		txtInput(bookiDetails.getLastName(), "K");
		txtInput(bookiDetails.getBillingAdd(), "Hyderabad");
		txtInput(bookiDetails.getCcNum(), "1234567812345678");
		bookiDetails.getCcType();
		bookiDetails.getExpDateMonth();
		bookiDetails.getExpDateYear();
		txtInput(bookiDetails.getCvv(), "123");
		click(bookiDetails.getBookNow());
		Sep10BookingConfirmationPojo5 bookinConfo = new Sep10BookingConfirmationPojo5();
		click(bookinConfo.locateByPartialLinkTest("Logout"));
		System.out.println("confirmed hotel and logged out");

	}

}
