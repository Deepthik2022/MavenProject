package org.test;

import org.testng.annotations.Test;

public class Sep17b {
	@Test(priority=-2)
	public void TC5() {
System.out.println("tc4");
	}
	@Test(invocationCount=2)
	public void TC6() {
		System.out.println("tc5");

	}
	@Test(groups="smoke")
	public void TC7() {
		System.out.println("tc6");

	}
	

}
