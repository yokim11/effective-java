package com.example.demo.app;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rule5Person {

	public static void main(String[] args) {
		long startTime = 0L;
		long finishTime = 0L;
	
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		Date birth;
		
		//
		Person person = new Person(null);
		startTime = System.currentTimeMillis();
		log.info("START {}", startTime);
		for (int i = 1900; i < (1900*100); i++) {
			gmtCal.set(i,  Calendar.JANUARY, 15, 0, 0);
			birth = gmtCal.getTime();
			person = new Person(birth);
//			log.info("{} is {}", birth, pe rson.isBabyMoomer());
		}
		finishTime = System.currentTimeMillis();
		log.info("END {}", finishTime);
		log.info("times spend  {}.", (finishTime - startTime));

		Person2 person2 = new Person2(null);
		startTime = System.currentTimeMillis();
		log.info("START {}", startTime);
		for (int i = 1900; i < (1900*100); i++) {
			gmtCal.set(i,  Calendar.JANUARY, 15, 0, 0);
			birth = gmtCal.getTime();
			person2 = new Person2(birth);
//			log.info("{} is {}", birth, person2.isBabyMoomer());
		}
		finishTime = System.currentTimeMillis();
		log.info("END {}", finishTime);
		log.info("times spend  {}.", (finishTime - startTime));

	}

}

