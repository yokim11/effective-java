package com.example.demo.app;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rule5 {

	public static void main(String[] args) {
		
		Rule5 rule5 = new Rule5(); 
		long startTime = 0L;
		long finishTime = 0L;
	
		startTime = System.currentTimeMillis();
		long sum1 = rule5.total_Long();
		finishTime = System.currentTimeMillis();
		log.info("sum1 is {}.", sum1);
		log.info("times spend  {}.", (finishTime - startTime));
		
		startTime = System.currentTimeMillis();
		long sum2 = rule5.total_long();
		finishTime = System.currentTimeMillis();
		log.info("sum2 is {}.", sum2);
		log.info("times spend  {}.", (finishTime - startTime));
		
	}

	public long total_Long() {
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}

	public long total_long() {
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}

}
