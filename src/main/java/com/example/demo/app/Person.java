package com.example.demo.app;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person {
	
	private final Date birthDate;
	

	public boolean isBabyMoomer() {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946,  Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1964, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
}
