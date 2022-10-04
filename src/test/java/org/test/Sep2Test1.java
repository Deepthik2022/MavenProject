package org.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sep2Test1 {
	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yy  hh:mm:a");
		String format = s.format(d);
		System.out.println(format);
	}

}
